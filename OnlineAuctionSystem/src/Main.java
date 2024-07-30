public class Main {
    public static void main(String[] args) {
        AuctionMediator mediator = new Auction();

        Colleague bidder1 = new Bidder("Chagan", mediator);
        Colleague bidder2 = new Bidder("Magan", mediator);

        bidder1.placeBid(100);
        bidder2.placeBid(200);
        bidder1.placeBid(250);
    }
}
