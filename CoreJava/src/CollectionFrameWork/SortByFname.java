package CollectionFrameWork;

import java.util.Collections;
import java.util.Comparator;

public class SortByFname implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		if (o1.getFname().compareTo(o2.getFname())==0) {
			
			return o1.getLname().compareTo(o2.getLname());
						
		}else {
		return o1.getFname().compareTo(o2.getFname());
		}
	}

}
