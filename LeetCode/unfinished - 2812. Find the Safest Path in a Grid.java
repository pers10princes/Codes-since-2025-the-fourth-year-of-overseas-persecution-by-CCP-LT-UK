import java.util.AbstractMap.*;


class Solution {
    static final List<SimpleImmutableEntry<Integer, Integer>> dirs = List.of(
        new SimpleImmutableEntry<>(0, 1),
        new SimpleImmutableEntry<>(0, -1),
        new SimpleImmutableEntry<>(1, 0),
        new SimpleImmutableEntry<>(-1, 0)
    );


    public int maximumSafenessFactor(List<List<Integer>> grid) {
        if (grid.getFirst().getFirst().equals(1) || grid.getLast().getLast().equals(1)) {
            return 0;
        }

        int n = grid.size();
        int o = n - 1;
        ArrayDeque<SimpleImmutableEntry<Integer, Integer>>dq = new ArrayDeque<>();
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(List::getLast));
        int val = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> list = grid.get(i);

            for (int j = 0; j < n; j++) {
                if (list.get(j).equals(1)) {
                    list.set(j, 0);
                    dq.offer(new SimpleImmutableEntry<>(i, j));
                } else {
                    list.set(j, -1);
                }
            }
        }

        for (var a : grid) {
            for (var i : a) {
                IO.print(i + " ");
            }
            IO.println();
        }

        while (!dq.isEmpty()) {
            val++;

            for (int i = dq.size(); i > 0; i--) {
                int  r = dq.peek().getKey();
                int c = dq.poll().getValue();

                for (var d : dirs) {
                    int x = r + d.getKey();
                    int y = c + d.getValue();

                    if (x < 0 || x == n || y < 0 || y == n || !grid.get(x).get(y).equals(-1)) {
                        continue;
                    }

                    grid.get(x).set(y, val);
                    dq.offer(new SimpleImmutableEntry<>(x, y));
                }
            }
        }

        pq.offer(List.of(0, 0, grid.getFirst().getFirst()));

        for (var a : grid) {
            for (var i : a) {
                IO.print(i + " ");
            }
            IO.println();
        }

        while (!pq.isEmpty()) {
            var al = pq.poll();
            int r = al.getFirst();
            int c = al.get(1);
            int v = al.getLast();

            if (r == o && c == o) {
                return v;
            }

            for (var d : dirs) {
                int x = r + d.getKey();
                int y = c + d.getValue();

                if (x < 0 || x == n || y < 0 || y == n || !grid.get(x).get(y).equals(-1)) {
                    continue;
                }

                pq.offer(List.of(x, y, Math.min(v, grid.get(x).get(y))));
                grid.get(x).set(y, -1);
            }
        }

        return -1;
    }
}
