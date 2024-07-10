import java.util.*;

public class Block {

  private int prevHash; // hash of the previous block
  private String data; // data or list of transactions in the block
  private int hash; // hash of the current block
  private long timeStamp; // as number of milliseconds since 1/1/1970

  public Block(String data, int pHash) {
    this.prevHash = pHash;
    this.data = data;
    this.timeStamp = new Date().getTime();
  }

}