
public class Insert_interval {
	# Definition for an interval.
	# class Interval(object):
	#     def __init__(self, s=0, e=0):
	#         self.start = s
	#         self.end = e

	class Solution(object):
	    def insert(self, intervals, newInterval):
	        """
	        :type intervals: List[Interval]
	        :type newInterval: Interval
	        :rtype: List[Interval]
	        """
	        diff = 0
	        if len(intervals)==0:
	            intervals.append(newInterval)
	            return intervals
	        
	        if newInterval == None:
	            return intervals
	        i = 0
	        while i <len(intervals):    
	            if newInterval.start >= intervals[i].start and newInterval.start <= intervals[i].end:
	                #comes between
	                if intervals[i].end < newInterval.end:
	                    intervals[i].end = newInterval.end
	                break
	            else :
	                diff = newInterval.start - intervals[i].end
	                if diff < 0:
	                    intervals.insert(i,newInterval)
	                    break
	            i+=1
	        if i == len(intervals):
	            intervals.append(newInterval)
	            return intervals
	        return self.mergeIntervals(intervals)
	        
	    def mergeIntervals(self,intervals):
	        prev = intervals[0]
	        #print prev.start
	        i=1
	        while(i<len(intervals)):
	            if prev.start <= intervals[i].start and prev.end >= intervals[i].start:
	                #print "True"
	                if prev.end < intervals[i].end:
	                    prev.end = intervals[i].end
	                intervals = intervals[:i]+intervals[i+1:]
	               # self.printf(intervals)
	                i-=1
	            else:
	                prev = intervals[i]
	           # print "-------------------"
	           # print prev.start,prev.end 
	           # print "-------------------"
	            i+=1
	        return intervals      
	    
	    def printf(self,intervals):
	        for i in range(len(intervals)):
	            print "[",intervals[i].start,intervals[i].end,"]"
	        
}
