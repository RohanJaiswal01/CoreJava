package CollectionFrameWork;

import java.util.Comparator;

public class SortByPhyMarks implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		return o1.getPhy()- o2.getPhy();//sort in natural order
		// return o2.getPhy()- o1.getPhy();//sort in descending order
	}

}
