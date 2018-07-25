package MultithreadingConcept;

public class PrintNumberOrString {
		public synchronized void printHellonumber(int n) {
			for (int i = 0; i < n; i ++ ) {
				System.out.println("Printing Hello " + i);
				if ((i % 10) == 0) {
					JustToPractiseWaitAndNotify.callnotify();					
					JustToPractiseWaitAndNotify.callwait();
				}
			}
			JustToPractiseWaitAndNotify.callnotify();					
		}
		public synchronized void printWorldNumber(int n) {
			for (int i = 0; i < n; i ++ ) {
				System.out.println("Printing World " + i);
				if ((i % 10) == 0) {
					JustToPractiseWaitAndNotify.callnotify();					
					JustToPractiseWaitAndNotify.callwait();
				}
			}
			JustToPractiseWaitAndNotify.callnotify();					
		}

}

