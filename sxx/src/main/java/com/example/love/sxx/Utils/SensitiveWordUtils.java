package com.example.love.sxx.Utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 类名称：敏感词过滤工具类
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/28
 */

@SuppressWarnings("rawtypes")
public class SensitiveWordUtils {
    /**
     * 敏感词库
     */
    public static Map sensitiveWordMap = null;

    /**
     * 只过滤最小敏感词
     */
    public static int minMatchType = 1;

    /**
     * 过滤所有敏感词
     */
    public static int maxMatchType = 2;

    /**
     *  返回从beginIndex开始的敏感词长度
     * @param txt
     * @param beginIndex
     * @param matchType
     * @return
     */
    public static int checkSensitiveWordSum(String txt, int beginIndex, int matchType) throws Exception{
        boolean flag = false;
        int sensitiveSum = 0;   //返回敏感词长度
        sensitiveWordMap = SensitiveWordInit.sensitiveWordMap;
        for(int i = beginIndex;i<txt.length();i++){
            char key = txt.charAt(i);
            sensitiveWordMap = (Map)sensitiveWordMap.get(key);
            if(sensitiveWordMap!=null){
                sensitiveSum++;
                if(sensitiveWordMap.get("isEnd").equals("1")){
                    flag = true;
                    if(matchType == minMatchType){
                        break;
                    }
                }
            }else{
                break;
            }
        }
        if(!flag || sensitiveSum<2){
            sensitiveSum = 0;
        }
        return sensitiveSum;
    }

    /**
     * 获取txt文本中的敏感词并保存
     *  为后续的replaceAll方法做准备工作
     * @param txt
     * @param matchType
     * @return
     */
    public static Set<String> getSensitiveWord(String txt, int matchType) throws  Exception{
        Set<String> sensitiveWord = new HashSet<String>();
        for (int i = 0; i < txt.length(); i++) {
            int sum = checkSensitiveWordSum(txt,i,matchType);
            if (sum > 0) {
                // 将检测出的敏感词保存到集合中
                sensitiveWord.add(txt.substring(i, i + sum));
                i = i + sum - 1;   //减一的目的是i下一次循环递增了
            }
        }
        return sensitiveWord;
    }

    /**
     * 替换敏感词
     *  无论敏感词长度多大，默认替代字符“***”
     * @param txt
     * @param matchType
     * @return
     */
    public static String replaceSensitiveWord(String txt, int matchType) throws Exception{
        String resultTxt = txt;
        Set<String> set = getSensitiveWord(txt, matchType);
        Iterator<String> iterator = set.iterator();
        String word = null;   //敏感词
        String replaceTxt = "***";   // 替换字符，这里默认“***”
        while (iterator.hasNext()) {
            word = iterator.next();
            resultTxt = resultTxt.replaceAll(word,replaceTxt);
        }
        return resultTxt;
}
}

