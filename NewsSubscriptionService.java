import java.util.*;

public class NewsSubscriptionService {
    public static void main(String[] args){

        Subscriber sawako = new Subscriber();
        sawako.setSubscriberName("Kuronuma Sawako");

        Subscriber chizuru = new Subscriber();
        chizuru.setSubscriberName("Yoshida Chizuru");

        Subscriber ayane = new Subscriber();
        ayane.setSubscriberName("Yano Ayane");

        // Add subscribers to subscriberList
        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(sawako);
        subscriberList.add(chizuru);
        subscriberList.add(ayane);

        // Create breaking news headlines
        NewsAgency news = new NewsAgency();
        news.setNews("New Technology Launched Today");
        news.setSubscriberList(subscriberList);

        // Notify subcribers
        System.out.println(news.notifySubscribers());

        // remove Juan, add Jerry and notify updates
        news.unsubscribe(ayane);

        Subscriber ryu = new Subscriber();
        ryu.setSubscriberName("Sanada Ryu");
        news.subscribe(ryu);

        // here is the updates
        news.setNews("Storm Hits the Region");
        System.out.println(news.notifySubscribers());
    }
}