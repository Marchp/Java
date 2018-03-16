package collection.map;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String [] args) {
		//����treemaptestapis
		treemaptestapis();
		testSubMapAPIs();
		testNavigableMapAPIs();
	}
	
	/*
	 *����treemap���õ� API
	 */
	private static void treemaptestapis() {
		//��ʼ�����������
		Random r=new Random(100);
		//����treemap����
		TreeMap tm=new TreeMap();
		
		//��ʼ��treemap
		tm.put("F", r.nextInt(100));
		tm.put("C", r.nextInt(100));
		tm.put("A", r.nextInt(100));
		tm.put("D", r.nextInt(100));
		tm.put("B", r.nextInt(100));
		tm.put("E", r.nextInt(100));
		
		System.out.println("TreeMap�ļ�ֵ�Ը���:"+tm.size());
		
		//��ӡtreemap��Ĭ�Ϲ��캯����treemap����key�Ĵ�С��������
		System.out.println("TreeMap:"+tm);
		
		//��ӡtreemap��:��ֵ�Ե�set���ϡ�����set���ϡ�ֵ��set����
		System.out.println("��ֵ�Ե�set����:"+tm.entrySet());
		System.out.println("����set����:"+tm.keySet());
		System.out.println("ֵ��set����:"+tm.values());
		
		//��ӡtreemap�ĵ�һ����ֵ��
		System.out.println("TreeMap�ĵ�һ����ֵ��:"+tm.firstEntry());
		
		//ceilingkey(key)����treemap�д��ڵ���key����С��key�����򷵻�null
		System.out.println("���ڵ���key=G��Ӧ��key:"+tm.ceilingKey("G"));
		
		//clone treemap
		System.out.println("TreeMap��clone:"+tm.clone());
		
		//treemap�ķ���map
		System.out.println("TreeMap�ķ���map:"+tm.descendingMap());
		
		//ɾ���ƶ���ֵ��entry����ӡ
		tm.remove("C");
		System.out.println("TreeMap:"+tm);
		
		//���treemap
		tm.clear();
		
		//�ж�treemap�Ƿ�Ϊ��
		System.out.println("Is empty? "+tm.isEmpty());	
	}
	
	
	/**
     * ����TreeMap����Map����
     */
    public static void testSubMapAPIs() {
        // �½�TreeMap
        TreeMap tmap = new TreeMap();
        // ���ӡ���ֵ�ԡ�
        tmap.put("a", 101);
        tmap.put("b", 102);
        tmap.put("c", 103);
        tmap.put("d", 104);
        tmap.put("e", 105);

        System.out.printf("\n ---- testSubMapAPIs ----\n");
        // ��ӡ��TreeMap
        System.out.printf("tmap:\n\t%s\n", tmap);

        // ���� headMap(K toKey),tokeyǰ��ļ�ֵ��(����������)
        System.out.printf("tmap.headMap(\"c\"):\n\t%s\n", tmap.headMap("c"));
        // ���� headMap(K toKey, boolean inclusive)��tokeyǰ��ļ�ֵ�ԣ�true��������,false��������
        System.out.printf("tmap.headMap(\"c\", true):\n\t%s\n", tmap.headMap("c", true));
        System.out.printf("tmap.headMap(\"c\", false):\n\t%s\n", tmap.headMap("c", false));

        // ���� tailMap(K fromKey)��formkey��ߵļ�ֵ��(����������)
        System.out.printf("tmap.tailMap(\"c\"):\n\t%s\n", tmap.tailMap("c"));
        // ���� tailMap(K fromKey, boolean inclusive)tokey����ļ�ֵ�ԣ�true��������,false��������
        System.out.printf("tmap.tailMap(\"c\", true):\n\t%s\n", tmap.tailMap("c", true));
        System.out.printf("tmap.tailMap(\"c\", false):\n\t%s\n", tmap.tailMap("c", false));
   
        // ���� subMap(K fromKey, K toKey)
        System.out.printf("tmap.subMap(\"a\", \"c\"):\n\t%s\n", tmap.subMap("a", "c"));
        // ���� 
        System.out.printf("tmap.subMap(\"a\", true, \"c\", true):\n\t%s\n", 
                tmap.subMap("a", true, "c", true));
        System.out.printf("tmap.subMap(\"a\", true, \"c\", false):\n\t%s\n", 
                tmap.subMap("a", true, "c", false));
        System.out.printf("tmap.subMap(\"a\", false, \"c\", true):\n\t%s\n", 
                tmap.subMap("a", false, "c", true));
        System.out.printf("tmap.subMap(\"a\", false, \"c\", false):\n\t%s\n", 
                tmap.subMap("a", false, "c", false));

        // ���� navigableKeySet()
        System.out.printf("tmap.navigableKeySet():\n\t%s\n", tmap.navigableKeySet());
        // ���� descendingKeySet()
        System.out.printf("tmap.descendingKeySet():\n\t%s\n", tmap.descendingKeySet());
    }

    /**
     * ����TreeMap�ĵ�������
     */
    public static void testNavigableMapAPIs() {
        // �½�TreeMap
        NavigableMap nav = new TreeMap();
        // ���ӡ���ֵ�ԡ�
        nav.put("aaa", 111);
        nav.put("bbb", 222);
        nav.put("eee", 333);
        nav.put("ccc", 555);
        nav.put("ddd", 444);

        System.out.printf("\n ---- testNavigableMapAPIs ----\n");
        // ��ӡ��TreeMap
        System.out.printf("Whole list:%s%n", nav);

        // ��ȡ��һ��key����һ��Entry
        System.out.printf("First key: %s\tFirst entry: %s%n",nav.firstKey(), nav.firstEntry());

        // ��ȡ���һ��key�����һ��Entry
        System.out.printf("Last key: %s\tLast entry: %s%n",nav.lastKey(), nav.lastEntry());

        // ��ȡ��С��/����bbb��������ֵ��
        System.out.printf("Key floor before bbb: %s%n",nav.floorKey("bbb"));

        // ��ȡ��С��bbb��������ֵ��
        System.out.printf("Key lower before bbb: %s%n", nav.lowerKey("bbb"));

        // ��ȡ������/����bbb������С��ֵ��
        System.out.printf("Key ceiling after ccc: %s%n",nav.ceilingKey("ccc"));

        // ��ȡ������bbb������С��ֵ��
        System.out.printf("Key higher after ccc: %s%n\n",nav.higherKey("ccc"));
    }

}