class HashTable_implemantation {
	public static void main(String[] args) {
		HashTableU<String> hs = new HashTableU<String>(10);
		hs.put(11, "hello");
		hs.put(21, "laya");
		hs.put(13, "nice");
		System.out.println(hs.get(21));
		
	}
}
class Entry{
	int key;
	Object value;
	Entry next;
	public Entry(){
		next = null;
	}
	public Entry(int k, Object v){
		key = k;
		value = v;
		next = null;
	}
	public int getKey(){
		return key;
	}
	public Object getValue(){
		return value;
	}
	
}

class HashTableU<T>{
	Entry[] ArrayHash;
	int size;
	
	public HashTableU(int size){
		this.size = size;
		ArrayHash = new Entry[size];
		for(int i = 0; i < size ; i++){
			ArrayHash[i] = new Entry();
		}
		
	}
	public int getHash(int k){
		return k % size;
	}
	public void put(int k,Object v){
		int hashIndex = getHash(k);
		//System.out.println(hashIndex);
		Entry ArrayValue = ArrayHash[hashIndex];
		Entry newEntry = new Entry(k, v);
		newEntry.next = ArrayValue.next;
		ArrayValue.next = newEntry;
		
	}
	public T get(int k){
		int hashIndex = getHash(k);
		Entry ArrayValue = ArrayHash[hashIndex];
		
		while (ArrayValue != null) {
			//System.out.println(ArrayValue.getValue());
			if(ArrayValue.getKey() == k){
				return (T)ArrayValue.getValue();				
			}
			ArrayValue = ArrayValue.next;
		}
		return null;
	}
	
}