enum HouseType{
		ONEBHK(150000),
		TWOBHK(250000),
		THREEBHK(350000);
		int price;

		HouseType(int price){
			this.price=price;
		}
		public int getPrice(){
			return price;
		}

}
public class HouseDetails{
		public static void main(String[]args){
			HouseType ht=HouseType.ONEBHK;
			System.out.println(ht+" Price is - "+ht.getPrice());
		}
}

