public class twenty_one
 {
    public static void main(String[] args) {
        {
             aa obj = new aa();
             obj.brand ="Lenovo";
             obj.price = 1000;
             System.out.println(obj.toString());
  
             aa obj1 = new aa();
             obj1.brand ="Lenovo";
             obj1.price = 1000;
             boolean  results= obj1.equals(obj);
             System.out.println(results);
        }
    }
    
}
class aa
{
  String brand;
  int price;
  public String toString()
    {
     return  brand+":"+price;

    }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    result = prime * result + price;
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    aa other = (aa) obj;
    if (brand == null) {
      if (other.brand != null)
        return false;
    } else if (!brand.equals(other.brand))
      return false;
    if (price != other.price)
      return false;
    return true;
  }
    
  

}
