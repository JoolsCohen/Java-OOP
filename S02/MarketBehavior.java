package S02;

public interface MarketBehavior {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();
}
