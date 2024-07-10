import java.util.*;

public class Block {

  public String prevHash; // hash of the previous block
  private String data; // data or list of transactions in the block
  public String hash; // hash of the current block
  private long timeStamp; // as number of milliseconds since 1/1/1970

  public Block(String data, String pHash) {
    this.prevHash = pHash;
    this.data = data;
    this.timeStamp = new Date().getTime();
    this.hash = calculateHash();
  }

  public String calculateHash() {
    String calculatedHash = StringUtil.applySha256(
        prevHash
            + Long.toString(timeStamp)
            + data);
    return calculatedHash;

  }

}