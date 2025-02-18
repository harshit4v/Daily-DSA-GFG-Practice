public int[][] kClosest(int[][] points, int k) {
        // Your code here
         PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> 
            Integer.compare((b[0] * b[0] + b[1] * b[1]), (a[0] * a[0] + a[1] * a[1]))
        );
        
        // Iterate over each point
        for (int[] point : points) {
            maxHeap.offer(point);
            // Keep only the k closest points in the heap
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        
        // Extract k closest points
        int[][] result = new int[k][2];
        int index = 0;
        while (!maxHeap.isEmpty()) {
            result[index++] = maxHeap.poll();
        }
        
        return result;
    }
