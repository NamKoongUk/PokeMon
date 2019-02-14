package controller;

import model.dao.UserDao;
import model.vo.User;

public class ItemManager {
   
   private MCManager mc = new MCManager();
   private UserDao ud;
   private User user;
   private UserManager um = new UserManager(user, ud);
   private int dG;
   
   
   
   
   public void decreaseGold(int check) {
      System.out.println("ItemMamager로 옴");
      //구매 총액, 현재 유저 소지 금액을 가져와서 돈 깍아주는
      System.out.println("구매총액 : "+check);
      System.out.println("내 돈 :"+um.getUserGold());
      dG = um.getUserGold() - check; 
      um.setUserGold(dG);
   }
   
   
   
   
   
   
   
   
   
   //배틀에서 받아와야 됨
   public void useStone() {
      
   }
   public void useBall() {
      
   }
   public void Recovery() {
      
   }
}