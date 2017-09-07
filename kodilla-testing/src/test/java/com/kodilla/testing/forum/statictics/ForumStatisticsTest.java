package com.kodilla.testing.forum.statictics;

import com.kodilla.testing.forum.statistics.AdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class ForumStatisticsTest {
    @Test
    public void forumStatisticsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics =mock(AdvStatistics.class);

        //When


        //Then
        assertEquals(1000, advStatistics.getAvgNumberOfCommentsPerUser());

    }






}
