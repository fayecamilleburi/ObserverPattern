public interface NewsAgencySubject {
  public void subscribe(Subscriber s);
  public void unsubscribe(Subscriber s);
  public String notifySubscribers();
}