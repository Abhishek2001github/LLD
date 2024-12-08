public class Inventory {
    ItemShelf[] inventory=null;

    Inventory(int itemCount){
        inventory = new ItemShelf[itemCount];
        initialEmptyInventory();
    }
    public ItemShelf[] getInventory(){
        return inventory;
    }
    public void setInventory(ItemShelf[] inventory){
        this.inventory = inventory;
    }
    public void initialEmptyInventory(){
        int startCode=101;
        for(int i=0; i<inventory.length; i++){
            ItemShelf space=new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i]=space;
            startCode++;
        }
    }
    public Item getItem(int codeNumber) throws Exception{
  for(ItemShelf item: inventory){
      if(item.code==codeNumber){
          if(item.isSoldOut()){
              throw new Exception("Sold out");
          }
          else {
              return item.item;
          }
      }
  }
  throw new Exception("Invalid code");
    }
    public void updateSoldOutItem(int codeNumber) {
        for(ItemShelf item: inventory){
            if(item.code==codeNumber){
                item.setSoldOut(true);
            }
        }
    }
}
