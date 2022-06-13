public class Program {
    public static void main(String[] args) {
        System.out.println("Offset_hash_1");
        HashTable hashTable = new OffsetHashTable(13);

        hashTable.insert(81);
        hashTable.print();
        System.out.println();

        hashTable.insert(52);
        hashTable.print();
        System.out.println();

        hashTable.insert(14);
        hashTable.print();
        System.out.println();

        hashTable.insert(84);
        hashTable.print();
        System.out.println();

        hashTable.insert(17);
        hashTable.print();
        System.out.println();

        hashTable.insert(1);
        hashTable.print();
        System.out.println();

        hashTable.insert(6);
        hashTable.print();
        System.out.println();

        hashTable.insert(49);
        hashTable.print();
        System.out.println();

        hashTable.insert(5);
        hashTable.print();
        System.out.println();

        hashTable.insert(64);
        hashTable.print();
        System.out.println();

        hashTable.insert(72);
        hashTable.print();
        System.out.println();

        hashTable.insert(15);
        hashTable.print();
        System.out.println();

        System.out.println("Offset_hash_2");

        HashTable hashTable1 = new OffsetHashTable(19);

        hashTable1.insert(87);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(69);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(29);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(54);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(20);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(11);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(81);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(62);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(94);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(24);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(98);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(87);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(34);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(84);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(73);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(54);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(11);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(34);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(84);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(20);
        hashTable1.print();
        System.out.println();

        System.out.println("Offset_hash_3");

        HashTable hashTable2 = new OffsetHashTable(19);

        hashTable2.insert(6);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(55);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(92);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(70);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(90);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(17);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(85);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(78);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(34);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(28);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(73);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(6);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(73);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(78);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(92);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(4);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(97);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(88);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(88);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(55);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(81);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(16);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(97);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(6);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(16);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(85);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(17);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(34);
        hashTable2.print();
        System.out.println();

        System.out.println("List_hash_1");
        HashTable listHashTable = new ListHashTable(13);

        listHashTable.insert(21);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(90);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(56);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(49);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(89);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(58);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(9);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(75);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(26);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(13);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(70);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(50);
        listHashTable.print();
        System.out.println();

        System.out.println("List_hash_2");

        HashTable listHashTable1 = new ListHashTable(19);

        listHashTable1.insert(26);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(13);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(61);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(47);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(16);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(91);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(31);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(77);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(68);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(71);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(53);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(55);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(85);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(97);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(91);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(47);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(61);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(31);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(2);
        listHashTable1.print();
        System.out.println();

        System.out.println("List_hash_3");

        HashTable listHashTable2 = new ListHashTable(19);


        listHashTable2.insert(76);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(19);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(5);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(48);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(43);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(72);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(36);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(31);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(79);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(55);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(41);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(11);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(72);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(19);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(79);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(82);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(5);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(96);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(48);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(31);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(48);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(67);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(39);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(39);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(5);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(55);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(76);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(43);
        listHashTable2.print();
        System.out.println();
    }
}