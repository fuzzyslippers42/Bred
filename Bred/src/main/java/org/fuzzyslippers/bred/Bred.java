/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fuzzyslippers.bred;
import redis.clients.jedis.*;
import redis.clients.jedis.Jedis;

/**
 *
 * @author Nick
 */
public class Bred {
    JedisPool jPool = new JedisPool(new JedisPoolConfig(), "localhost");
    Jedis jedis = new jPool.getResource();
    static public boolean makeConnection(String databaseName){
        // This function creates the database connection with the database named databaseName
        jedis.set("server:name",databaseName);
        
        return true;
    }
}
