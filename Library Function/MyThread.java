class MyThread {
	public static void main(String[] args) {
		
		Thread t = new Thread(){
			
			public void run(){
				
				for(int i=1;i<=20;i++){
					System.out.println("printing....."+i);
					try {
						sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
			
			
		};
		t.start();
		
		
	}
}
