package com.cloudwick.java.colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingManager {

	public static void main(String[] args) {

		List userlist = new ArrayList();
		
UserCollections user1= new UserCollections();

user1.setName("A");
user1.setSSN(1111);

UserCollections user2= new UserCollections();

user2.setName("B");
user2.setSSN(2222);
UserCollections user3= new UserCollections();

user3.setName("C");
user3.setSSN(3333);

userlist.add(user1);
userlist.add(user2);
userlist.add(user3);

Collections.sort(userlist,new ());

for(Object Obj: userlist)
{
	UserCollections u= (UserCollections)Obj;
	
	
	System.out.println(u.getSSN()+"   "+u.getName());
}
	}
	

}
