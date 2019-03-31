package model.java_structures;

import java.util.ArrayList;
import java.util.Iterator;

public class ArbolRojoN<V, K extends Comparable<K>> implements IArbolRN<V , K>{

	private NodoRojoN<V, K> raiz;
	int tamano ;

//	public public ArbolRojoN<V, K>() {
//		tamano=0; TODO constructor?
//	}

	@Override
	public int size() {
		return tamano;
	}

	@Override
	public boolean isEmpty() {
		if (tamano == 0){return true;}return false;
	}

	@Override
	public V get(K key) {
		NodoRojoN<V, K> n = raiz;
		while(n.darLlave()!=key&& (n.darDerecha()!=null||n.darIzq()!=null)){
			if(n.darLlave().compareTo(key)<0){
				n=n.darDerecha();
			}
			if(n.darLlave().compareTo(key)>0){
				n=n.darIzq();
			}
			if(n.darLlave().compareTo(key)==0){
				return n.darValor();
			}
		}
		return null;
	}

	@Override
	public int getHeight(K key) {
		NodoRojoN<V, K> n = raiz;
		int r=0;
		while(n.darLlave()!=key&& (n.darDerecha()!=null||n.darIzq()!=null)){
			if(n.darLlave().compareTo(key)<0){
				n=n.darDerecha();
				r++;
			}
			if(n.darLlave().compareTo(key)>0){
				n=n.darIzq();
				r++;
			}
			if(n.darLlave().compareTo(key)==0){
				return r;
			}
		}
		return -1;
	}

	@Override
	public boolean contains(K key) {
		if(get(key)!=null){return true;}else return false;
	}

	@Override
	public void put(K key, V val) {
		NodoRojoN<V, K> n = raiz;
		NodoRojoN<V, K> add = new NodoRojoN<V, K>(key, val);
		while(n.darLlave()!=key&& (n.darDerecha()!=null||n.darIzq()!=null)){
			if(n.darLlave().compareTo(key)<0){
				if(n.darDerecha().darLlave().compareTo(key)>0){
					//TODO aca va (terminar)
				}
			}
			if(n.darLlave().compareTo(key)>0){
				if(n.darIzq().darLlave().compareTo(key)<0){
					//TODO aca va (terminar)
				}
			}
			if(n.darLlave().compareTo(key)==0){
				 n.asignarValor(val);
				 break;
			}
		}
	}

	@Override
	public int height() {
		NodoRojoN<V, K> nodoi = raiz;
		NodoRojoN<V, K> nodod = raiz;
		int i=0, d=0;
		while(nodod!=null||nodoi!=null){
				if(nodod!=null){
					i++;
					nodod=nodod.darDerecha();
				}
				if(nodoi!=null){
					d++;
					nodoi=nodoi.darIzq();
				}
		}
		return 1+i+d;		
	}

	@Override
	public K min() {
		if(raiz!=null){
			NodoRojoN<V, K> r = raiz;
			while(r.darIzq()!=null){
				r=r.darIzq();
			}
			return r.darLlave();
		}
		else{return null;}
	}

	@Override
	public K max() {
		if(raiz!=null){
			NodoRojoN<V, K> r = raiz;
			while(r.darDerecha()!=null){
				r=r.darDerecha();
			}
			return r.darLlave();
		}
		else{return null;}
	}

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<K> keys() {
		ArrayList list = new ArrayList<>(); 
		Iterator iterator = list.iterator();
		if(raiz!=null){
			NodoRojoN<V, K> r = raiz;
			while(r.darIzq()!=null){
				r=r.darIzq();
			}
			return iterator;
	    }
		else return null;	
	}

	@Override
	public Iterator<V> valuesInRange(K init, K end) {
		NodoRojoN<V, K> ini = raiz;
		while(ini.darLlave().compareTo(init)>0&&ini.darIzq()!=null){
			
		}
		return null;
	}

	@Override
	public Iterator<K> keysInRange(K init, K end) {
		// TODO Auto-generated method stub
		return null;
	}



	//	private NodoRojoN<V, K> raiz;
	//
	//	@Override
	//	public boolean darColor(NodoRojoN<V, K> nodo) {
	//		return nodo.darColor();
	//	}
	//
	//	@Override
	//	public int size(NodoRojoN<V, K> nodo) {
	//		int i=0, d=0;
	//		if(nodo.darDerecha()!=null){
	//			i=size(nodo.darIzq());
	//		}
	//		if(nodo.darDerecha()!=null){
	//			d=size(nodo.darDerecha());
	//		}
	//		return nodo.peso()+i+d;
	//	}
	//
	//	@Override
	//	public int sizeTotal() {
	//		return size(raiz);
	//	}
	//
	//	@Override
	//	public boolean isEmpty() {
	//		if(sizeTotal()==0){
	//			return true;
	//		}
	//		return false;
	//	}
	//
	//	@Override
	//	public void delete(NodoRojoN<V, K> nodo) {
	//		NodoRojoN<V, K> b = buscar(nodo.darLlave());
	//		//
	//	}
	//
	//	@Override
	//	public void rotateRight(NodoRojoN<V, K> nodo) {
	//		NodoRojoN<V, K> x = nodo.darIzq();
	//		nodo.asignarIzq(x.darDerecha());
	//		x.asignarDer(nodo);
	//		x.asignarColor(nodo.darColor());
	//		nodo.asignarColor(true);// true es rojo
	//	}
	//
	//	@Override
	//	public void rotateLeft(NodoRojoN<V, K> nodo) {
	//
	//		NodoRojoN<V, K> x = nodo.darDerecha();
	//		nodo.asignarDer(x.darIzq());
	//		x.asignarIzq(nodo);
	//		x.asignarColor(nodo.darColor());
	//		nodo.asignarColor(true);//true es rojo
	//
	//	}
	//
	//	@Override
	//	public void flipCollors(NodoRojoN<V, K> nodo) {
	//		{
	//			nodo.cambiarColor();
	//			nodo.darDerecha().cambiarColor();
	//			nodo.darIzq().cambiarColor();
	//		}
	//
	//	}
	//
	//	//	@Override
	//	//	public void moveRedLeft(NodoRojoN<V, K> nodo) {
	//	//		// TODO Auto-generated method stub
	//	//		
	//	//	}
	//	//
	//	//	@Override
	//	//	public void rotateRedRight(NodoRojoN<V, K> nodo) {
	//	//		// TODO Auto-generated method stub
	//	//	
	//	//	}
	//
	//
	//	@Override
	//	public void add(V valor, K llave) {
	//
	//		if (buscar(llave)==null){ // Do standard insert, with red link to parent.
	//
	//			if(buscar(llave)==null){
	//				NodoRojoN<V, K> h = new NodoRojoN<>(llave, valor);
	//				NodoRojoN<V, K> este = raiz;
	//				boolean done = false;
	//				while (!done){
	//					if (este.darDerecha()!=null){
	//						este=este.darDerecha();
	//					}
	//					if (este.darIzq()!=null){
	//						este=este.darIzq();
	//					}
	//					if (este.darDerecha()==null){
	//						este=este.darDerecha();
	//						done=true;
	//					}
	//				 if (este.darIzq()==null){
	//						este=este.darIzq();
	//						done=true;
	//					}
	//				}
	//			}
	//			//ESTO ES DEL LIBRO
	//			//			int cmp = llave.compareTo(h.key);
	//			//			
	//			//			if (cmp < 0) {
	//			//				h.left = put(h.left, key, val);
	//			//			}
	//			//			else if (cmp > 0) {
	//			//				h.right = put(h.right, key, val);
	//			//			}
	//			//			if (isRed(h.right) && !isRed(h.left)) {
	//			//				h = rotateLeft(h);
	//			//			}
	//			//			if (isRed(h.left) && isRed(h.left.left)) {
	//			//				h = rotateRight(h);
	//			//			}
	//			//			if (isRed(h.left) && isRed(h.right)){
	//			//				flipColors(h);
	//		}else{ 
	//			NodoRojoN<V, K> n=buscar(llave);
	//			n.asignarValor(valor);
	//		}
	//
	//		//		NodoRojoN<V, K> nodo = new NodoRojoN<>(llave, valor);
	//		//		if (raiz!=null){
	//		//			if(llave.compareTo(raiz.darLlave())>0){
	//		//				
	//		//			}else if(llave.compareTo(raiz.darLlave())<0){
	//		//				
	//		//			}else{
	//		//				raiz.asignarDer(nodo);
	//		//			}
	//		//		}
	//		//		else{raiz = nodo;
	//		//		}
	//	}
	//
	//	@Override
	//	public NodoRojoN<V, K> buscar(K key) {
	//		NodoRojoN<V, K> este = raiz;
	//		while(este!=null){
	//			if (key.compareTo(este.darLlave())>0){
	//				este=este.darDerecha();
	//			}
	//			else if (key.compareTo(este.darLlave())<0){
	//				este=este.darIzq();
	//			}
	//			else {
	//				return este;
	//			}
	//		}
	//		return este;
	//	}
}
