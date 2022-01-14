package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ToSynchronizeCollection {//to synchronize non-synchronized collection
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		List syncl = Collections.synchronizedList(l);//method to synchronized collections
		
		syncl.add(1);
		syncl.add(2);
		syncl.add(3);
		syncl.add(4);
		syncl.add(5);
				
		Collection c = new ArrayList<>();
		
		Collection c1 = Collections.synchronizedCollection(c);
		//Set syncset = Collections.synchronizedCollection(s);
		//SortedSet syncs1 = Collections.synchronizedCollection(s1);
		//Map syncMap = Collections.synchronizedCollection(m);
		//TreeMap synctm = Collections.synchronizedCollection(tm);
	}

}
