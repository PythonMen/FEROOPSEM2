public class LabVj21 {
    abstract class Parcel implements Encodable{

        private String sender;
        private String recipient;
        private String senderAddress;
        private String recipientAddress;

        public Parcel(){
            super();
            this.sender = "";
            this.recipient = "";
            this.senderAddress = "";
            this.recipientAddress = "";
        }
        public Parcel(String sender, String senderAddress, String recipient, String recipientAddress){
            this.sender = sender;
            this.recipient = recipient;
            this.senderAddress = senderAddress;
            this.recipientAddress = recipientAddress;
        }
        @Override
        public String toString(){
            return String.format("%s,%s-%s,%s", sender, senderAddress, recipient, recipientAddress);
        }

        @Override
        public void encode(){
            char senderInd = this.sender.charAt(0);
            this.sender = String.valueOf(senderInd);
            char recipientInd = this.recipient.charAt(0);
            this.recipient = String.valueOf(recipientInd);
            String tempAdress = this.recipientAddress;
            this.recipientAddress = this.senderAddress;
            this.senderAddress = tempAdress;
        }
    }


    class Letter extends Parcel {
        private int numberOfPages;

        public Letter(String sender, String recipient, String senderAddress, String recipientAddress, int numberOfPages) {
            super(sender, recipient, senderAddress, recipientAddress);
            this.numberOfPages = numberOfPages;
        }

        @Override
        public String toString() {
            return super.toString() + "(" + numberOfPages + ")";
        }

    }

    class Packet extends Parcel{
        int length,width,height,weight;

        public Packet (String sender, String recipient, String senderAddress, String recipientAddress, int length, int width, int height, int weight){
            super(sender, recipient, senderAddress, recipientAddress);
            this.length = length;
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return super.toString() + "[" + length + "," + width + "," + height + "," + weight + "]";
        }
    }

    public interface Encodable {
        public void encode();
    }
}
