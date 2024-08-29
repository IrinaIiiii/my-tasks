package task6;

import java.lang.reflect.Array;
import java.util.*;

public class GoogleEngine {
    
    private Map<String, List<WebPage>> map = new HashMap<>();
    
    public void add(WebPage webPage) {
        String title = webPage.getTitle();
        String[] array = title.split(" ");
        for (int i = 0; i <array.length ; i++) {
            if (map.containsKey(array[i])) {
                List<WebPage> list = map.get(array[i]);
                list.add(webPage);
            } else  {
                List<WebPage> list = new ArrayList<>();
                list.add(webPage);
                map.put(array[i],list);
            }
        }
        
    }

    public void delete(String url) {

        for (Map.Entry<String,List<WebPage>> entry: map.entrySet()) {
            Iterator<WebPage> iterator = entry.getValue().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getUrl().equals(url)) {
                    iterator.remove();
                }
            }
        }

    }

    public void upgrade(String url, String content) {
        for (var entry: map.entrySet()) {
            for (WebPage webPage: entry.getValue()) {
                if (webPage.getUrl().equals(url)) {
                    webPage.setContent(content);
                }
            }
        }

    }

    public List<WebPage> getListWebPage(String word) {
        if (map.containsKey(word)) {
            return map.get(word);
        }
        return new ArrayList<>();
    }

}
