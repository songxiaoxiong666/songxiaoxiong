package com.example.love.sxx.Utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 类名称：
 * 类描述：
 *
 * @author sxx
 * @Date 2020/6/28
 */
public class SensitiveWordInit {

    public static Map sensitiveWordMap = null;


    /**
     *  加载敏感词库
     * @return
     * @throws Exception
     */
    public Set<String> LoadSetitiveWord() throws Exception{
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        Set<String> set = new HashSet<String>();
        try{
            inputStream = getClass().getClassLoader().getResourceAsStream("CensorWords.txt");

            inputStreamReader = new InputStreamReader(inputStream,"UTF-8");

            bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            while((str=bufferedReader.readLine())!=null){
                set.add(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bufferedReader!=null){
                bufferedReader.close();
            }
            if(inputStreamReader!=null){
                inputStreamReader.close();
            }
            if(inputStream!=null){
                inputStream.close();
            }
        }
        return set;
    }

    /**
     *  把敏感词加入到HashMap
     * @param keyWordSet
     * @return
     */
    public Map addSensitiveWordToHashMap(Set<String> keyWordSet){
        sensitiveWordMap  = new HashMap(keyWordSet.size());
        Map nowMap = null;
        Iterator iterator = keyWordSet.iterator();
        while(iterator.hasNext()){
            String str = (String) iterator.next();
            nowMap = sensitiveWordMap;
            for(int i = 0;i<str.length();i++){
                char word = str.charAt(i);
                Object wordMap = sensitiveWordMap.get(word);
                if(wordMap!=null){
                    nowMap = (Map) wordMap;
                }else{
                    Map<String,String> newMap = new HashMap<String,String>();
                    newMap.put("isEnd","0");
                    nowMap.put(word,newMap);
                    nowMap = newMap;
                }
                if(i==str.length()-1){
                    nowMap.put("isEnd","1");
                }
            }
        }
        return sensitiveWordMap;
    }
}

