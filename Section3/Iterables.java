package Section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

/* Implementing ITERABLE interface allows an object to be the target of the "foreach" statement */
class UrlLibrary implements Iterable<String>{
	private LinkedList<String> urls = new LinkedList<String>();
	
	/* An iterator over a collection */
	private class UrlIterator implements Iterator<String>{
		int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			StringBuilder sp = new StringBuilder();
			try {
				URL url = new URL(urls.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				
				String line = null;
				while((line = br.readLine()) != null){
					sp.append(line);
					sp.append("\n");
				}
				br.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
			index++;
			return sp.toString();
		}

		@Override
		public void remove() {
			urls.remove(index);	
		}
		
	}
	
	public UrlLibrary() {
		urls.add("https://www.gmail.com/");
		urls.add("https://www.picasa.com/");
		urls.add("http://www.bbc.com/");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}
	

	/* This Iterator allows us to iterate over the object of this class type */
	/*public Iterator<String> iterator() {
		return url.iterator(); // using the READY MADE LinkedList iterator
	}*/
	
}

public class Iterables {
	public static void main(String[] args){
		UrlLibrary urls = new UrlLibrary();
		
		for(String html: urls){
			System.out.println(html.length());
			System.out.println(html);
		}
	}

}
