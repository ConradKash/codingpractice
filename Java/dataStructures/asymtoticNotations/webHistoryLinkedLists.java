package dataStructures.asymtoticNotations;

    public class webHistoryLinkedLists {
        private Node head;

        private class Node {
            String data;
            Node next;

            Node(String data) {
                this.data = data;
                this.next = null;
            }
        }

        public void addToFront(String data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        public boolean searchData(String data) {
            int low = 0;
            int high = getSize() - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                String midData = getNodeDataAt(mid);

                if (midData.equals(data)) {
                    return true;
                } else if (midData.compareTo(data) > 0) {
                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }

            return false;
        }

        private int getSize() {
            int size = 0;
            Node current = head;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }

        private String getNodeDataAt(int index) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        public static void main(String[] args) {
            webHistoryLinkedLists searchHistory = new webHistoryLinkedLists();
            searchHistory.addToFront("Edge");
            searchHistory.addToFront("Firefox");
            searchHistory.addToFront("Chrome");
            searchHistory.addToFront("bing");
            searchHistory.addToFront("google");
            searchHistory.addToFront("GitHub");
            searchHistory.addToFront("Programming");
            searchHistory.addToFront("Code_Editor");
            searchHistory.addToFront("Search_History");

            searchHistory.printList();

            System.out.println(searchHistory.getNodeDataAt(3));

            // Retrieving data from a long search history
            String searchData = "google";
            if (searchHistory.searchData(searchData)) {
                System.out.println("Found: " + searchData);
            } else {
                System.out.println("Not found: " + searchData);
            }
        }
    }

