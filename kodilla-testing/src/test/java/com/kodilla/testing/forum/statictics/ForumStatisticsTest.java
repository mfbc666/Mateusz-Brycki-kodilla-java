package com.kodilla.testing.forum.statictics;

import com.kodilla.testing.forum.statistics.AdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

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
    }

    @Test
    public void forumStatisticsWithMock(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(Collections.singletonList("user"));
        /*when(statisticsMock.postsCount()).thenReturn(7);*/

        //When
        target.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, target.getAvgNumberOfCommentsPerUser());
        /*assertEquals(5, target.getNumberOfPosts());
        assertEquals(7, target.getNumberOfComments());*/


    }






}
