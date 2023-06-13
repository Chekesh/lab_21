public interface Subscribers {
    void subscribe(Group gr);
    void unsubscribe(Group gr);
    void update(String news, String name);
}
