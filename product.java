public class Product{
  String name;
  double purchaseCost;
  int sellPrice;
  int quantity;
  public Product(double purchaseCost, int sellPrice, int quantity){
    this.purchaseCost = purchaseCost;
    this.sellPrice = sellPrice;
    this.quantity = quantity;
  }
  public double getpurchaseCost(){
    return purchaseCost;
  }
  public int getsellPrice(){
    return sellPrice;
  }
  public int getQuantity(){
    return quantity;
  }
}
