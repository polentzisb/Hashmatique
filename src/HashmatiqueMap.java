import java.util.HashMap;
import java.util.Set;

public class HashmatiqueMap {
    public void retrieveSongData(){
        HashMap<String, String> songMap = new HashMap<>();
        songMap.put("Smile Like You Mean It", "Save some face You know you've only got one Change your ways");
        songMap.put("Mr. Brightside", "Coming out of my cage And I've been doing just fine Gotta, gotta be down");
        songMap.put("Shot At The Night", "Once in a lifetime, the suffering of fools");
        songMap.put("Spaceman", "It started with a low light Next thing I knew they ripped me from my bed");

        String single = songMap.get("Spaceman");
        System.out.println(single);

        Set<String> keys = songMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}
