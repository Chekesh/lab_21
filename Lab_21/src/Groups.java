import java.util.ArrayList;
import java.util.List;

public class Groups implements Group{
    String name;
    List<Subscribers> subscribers;
    List<String> news;

    Groups(String name){
        this.name=name;
        this.news = new ArrayList<>();
        this.subscribers= new ArrayList<>();
    }

    void news(String news){
        this.news.add(news);
        alert();
    }

    @Override
    public void newSubscriber(Subscribers sub){//, User us) {
        subscribers.add(sub);
        //System.out.println(us.name+" подписался");
    }
    @Override
    public void dallSubscriber(Subscribers sub) {
        subscribers.remove(sub);
    }

    @Override
    public void alert() {
        for(Subscribers sub:subscribers){
            sub.update(news.get(news.size()-1), this.name );
        }
    }
}
