package service;

import entity.Segment;

import java.util.List;

public interface SegmentService {
    List<Segment> getAllSegments();
    Segment getSegmentById(Long segmentId);
    void saveSegment(Segment segment);
    void updateSegment(Long segmentId, Segment updatedSegment);
    void deleteSegment(Long segmentId);
}

