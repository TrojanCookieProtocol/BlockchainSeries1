public class TestBlockchain {

	public static void main(String args[]) {
		
		Blockchain tcpCoin = new Blockchain();
		
		Block a = new Block("0x200", new java.util.Date(), "<transactions>");
		Block b = new Block("0x200", new java.util.Date(), "<transactions>");
		Block c = new Block("0x200", new java.util.Date(), "<transactions>");
		
		tcpCoin.addBlock(a);
		tcpCoin.addBlock(b);
		tcpCoin.addBlock(c);
		
		//tcpCoin.getLatestBlock().setPreviousHash("ABCDEFG");
		
		tcpCoin.displayChain();
		
		tcpCoin.isValid();

	}
	
}
