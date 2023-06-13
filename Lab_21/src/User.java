public class User implements Subscribers {
    String name;
    User(String name){
        this.name=name;
    }

    @Override
    public void subscribe(Group gr) {
        gr.newSubscriber(this);
    }
    @Override
    public void unsubscribe(Group gr) {
        gr.dallSubscriber(this);
    }

    @Override
    public void update(String news, String name){
        System.out.println("Привет " +this.name+" канал \""+name+"\" выпустил новую запись: "+news+"\n ====================");
    }

}
