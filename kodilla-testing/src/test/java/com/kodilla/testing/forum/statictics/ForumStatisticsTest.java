package com.kodilla.testing.forum.statictics;

import com.kodilla.testing.forum.statistics.AdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {

    private Statistics statisticsMock;
    private AdvStatistics target;

    @Before
    public void setUp(){
        statisticsMock = mock(Statistics.class);
        target = new AdvStatistics();
        System.out.println("Test started");
    }
    @After
    public void finish(){
        System.out.println("Test Finished");
    }

    @Test
    public void forumStatisticsWithMock(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.userCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        target.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, target.getNumberOfPosts());
        assertEquals(1000, target.getNumberOfPosts());
        assertEquals(0, target.getNumberOfComments());
        assertEquals(500, target.getAvgNumberOfCommentsPerUser());
        assertEquals(7, target.getNumberOfComments());
    }
}