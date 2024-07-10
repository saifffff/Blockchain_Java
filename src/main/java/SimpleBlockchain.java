import java.util.*;

public class SimpleBlockchain {

  public static void main(String[] args) {

    Block genesisBlock = new Block("Genesis Block", "0");
    System.out.println("Hash for genesis block 0 is - " + genesisBlock.hash);

    Block secondBlock = new Block("Second Block", genesisBlock.hash);
    System.out.println("Hash for Second Block is -" + secondBlock.hash);

    Block thirdBlock = new Block("Third Block", secondBlock.hash);
    System.out.println("Hash for Third Block is -" + thirdBlock.hash);

  }
}