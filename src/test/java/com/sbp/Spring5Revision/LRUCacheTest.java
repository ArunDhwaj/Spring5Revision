package com.sbp.Spring5Revision;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class LRUCacheTest
{
    private LRUCache<Integer, Integer> c;

    public LRUCacheTest()
    {
        this.c = new LRUCache<>(2);
    }

    @Test
    public void testCacheStartsEmpty()
    {
        assertEquals(c.get(1), null);
    }

    @Test
    public void testSetBelowCapacity()
    {
        c.put(1, 1);
        assertEquals(c.get(1), 1);
        assertEquals(c.get(2), null);
        c.put(2, 4);
        assertEquals(c.get(1), 1);
        assertEquals(c.get(2), 4);
    }

    @Test
    public void testCapacityReachedOldestRemoved()
    {
        c.put(1, 1);
        c.put(2, 4);
        c.put(3, 9);
        assertEquals(c.get(1), null);
        assertEquals(c.get(2), 4);
        assertEquals(c.get(3), 9);
    }

    @Test
    public void testGetRenewsEntry()
    {
        c.put(1, 1);
        c.put(2, 4);
        assertEquals(c.get(1), 1);
        c.put(3, 9);
        assertEquals(c.get(1), 1);
        assertEquals(c.get(2), null);
        assertEquals(c.get(3), 9);
    }
}