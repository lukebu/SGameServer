package com.lukebu.item;
import com.lukebu.socket.Socket;
import java.util.LinkedList;

public class Item {

    private int itemId;
    private int itemLevel;
    private int itemRarity;
    private ItemType itemType;
    private int itemQuantities;
    private Boolean itemSocket;


    /*Weapon*/
    private int weaponAttack;
    private int weaponMagicAttack;

    /*Armor*/
    private int Armor;

    /*Armor, weapon*/
    private int maxItemSockets;
    private LinkedList<Socket> sockets;

}
