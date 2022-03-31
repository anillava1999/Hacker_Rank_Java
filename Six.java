/*

There are  players in a tournament. You will be given the name of each player and his score. You need to sort the players in decreasing order by score. If two players have the same score, the one whose name is lexicographically larger should appear first.

Note We have already provided you partially completed code in the editor. Your task is to create the class Checker which uses a comparator desc to sort the players.

A string is lexicographically smaller than another string if it appears earlier in a standard dictionary. For example, "cat" is lexicographically smaller than "dog", but larger than "cab" or "ca".

Input Format

The first line contains an integer , the number of players. The next  lines contain the name of a player and his score separated by a space. Two players can have the same name. A name will consist of lower-case English characters. The score of a player can range from  to . You don't need to worry about any other constraints.

Output Format

Print the sorted order of players and their score as explained in the problem statement.

Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Sample Output

aleksa 150
david 100
amy 100
aakansha 75
heraldo 50

*/

class Checker {
    static Comparator<Player> desc = new Comparator<Player>() {
        public int compare(Player p1, Player p2) {
            if (p2.score == p1.score) {
                    return String.CASE_INSENSITIVE_ORDER.compare(p2.name, p1.name);
            }
            return p2.score - p1.score;
        }
    };
}
