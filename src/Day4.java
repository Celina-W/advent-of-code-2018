public class Day4 {

	public static void main(String[] args) {
		
		/*String puzzleInput = "[1518-11-01 00:00] Guard #10 begins shift\r\n" + 
				"[1518-11-01 00:05] falls asleep\r\n" + 
				"[1518-11-01 00:25] wakes up\r\n" + 
				"[1518-11-01 00:30] falls asleep\r\n" + 
				"[1518-11-01 00:55] wakes up\r\n" + 
				"[1518-11-01 23:58] Guard #99 begins shift\r\n" + 
				"[1518-11-02 00:40] falls asleep\r\n" + 
				"[1518-11-02 00:50] wakes up\r\n" + 
				"[1518-11-03 00:05] Guard #10 begins shift\r\n" + 
				"[1518-11-03 00:24] falls asleep\r\n" + 
				"[1518-11-03 00:29] wakes up\r\n" + 
				"[1518-11-04 00:02] Guard #99 begins shift\r\n" + 
				"[1518-11-04 00:36] falls asleep\r\n" + 
				"[1518-11-04 00:46] wakes up\r\n" + 
				"[1518-11-05 00:03] Guard #99 begins shift\r\n" + 
				"[1518-11-05 00:45] falls asleep\r\n" + 
				"[1518-11-05 00:55] wakes up";*/
		String puzzleInput = "[1518-09-20 00:43] falls asleep\r\n" + 
				"[1518-09-20 00:56] wakes up\r\n" + 
				"[1518-04-06 00:34] falls asleep\r\n" + 
				"[1518-11-03 00:33] wakes up\r\n" + 
				"[1518-03-16 00:08] falls asleep\r\n" + 
				"[1518-09-12 00:46] wakes up\r\n" + 
				"[1518-05-11 00:48] wakes up\r\n" + 
				"[1518-04-22 00:59] wakes up\r\n" + 
				"[1518-08-05 00:59] wakes up\r\n" + 
				"[1518-07-25 00:24] falls asleep\r\n" + 
				"[1518-04-11 00:15] wakes up\r\n" + 
				"[1518-05-24 00:59] wakes up\r\n" + 
				"[1518-10-08 00:16] falls asleep\r\n" + 
				"[1518-07-20 00:36] wakes up\r\n" + 
				"[1518-09-23 00:39] wakes up\r\n" + 
				"[1518-07-17 00:55] wakes up\r\n" + 
				"[1518-08-19 00:52] wakes up\r\n" + 
				"[1518-10-29 00:09] falls asleep\r\n" + 
				"[1518-05-14 23:58] Guard #1559 begins shift\r\n" + 
				"[1518-04-13 00:39] falls asleep\r\n" + 
				"[1518-05-19 23:57] Guard #2749 begins shift\r\n" + 
				"[1518-02-14 00:45] wakes up\r\n" + 
				"[1518-08-05 23:51] Guard #3323 begins shift\r\n" + 
				"[1518-06-26 00:04] Guard #1093 begins shift\r\n" + 
				"[1518-02-22 00:33] wakes up\r\n" + 
				"[1518-07-20 00:03] Guard #811 begins shift\r\n" + 
				"[1518-10-07 00:15] wakes up\r\n" + 
				"[1518-07-31 00:23] falls asleep\r\n" + 
				"[1518-09-22 00:17] falls asleep\r\n" + 
				"[1518-09-03 00:43] wakes up\r\n" + 
				"[1518-05-28 00:47] falls asleep\r\n" + 
				"[1518-07-08 00:03] Guard #1093 begins shift\r\n" + 
				"[1518-05-02 00:02] falls asleep\r\n" + 
				"[1518-04-17 00:54] wakes up\r\n" + 
				"[1518-09-18 23:48] Guard #1327 begins shift\r\n" + 
				"[1518-07-31 00:58] wakes up\r\n" + 
				"[1518-09-21 00:00] Guard #3491 begins shift\r\n" + 
				"[1518-10-08 00:29] wakes up\r\n" + 
				"[1518-05-16 23:57] Guard #3491 begins shift\r\n" + 
				"[1518-04-23 00:56] wakes up\r\n" + 
				"[1518-08-29 23:57] Guard #2221 begins shift\r\n" + 
				"[1518-05-03 00:45] falls asleep\r\n" + 
				"[1518-03-12 00:03] Guard #3137 begins shift\r\n" + 
				"[1518-10-28 00:03] Guard #1637 begins shift\r\n" + 
				"[1518-07-14 00:51] falls asleep\r\n" + 
				"[1518-04-16 23:56] Guard #1637 begins shift\r\n" + 
				"[1518-03-04 00:33] wakes up\r\n" + 
				"[1518-06-22 00:54] falls asleep\r\n" + 
				"[1518-09-27 00:40] falls asleep\r\n" + 
				"[1518-07-12 00:00] Guard #1637 begins shift\r\n" + 
				"[1518-05-01 00:00] Guard #2399 begins shift\r\n" + 
				"[1518-02-10 00:52] wakes up\r\n" + 
				"[1518-09-16 00:04] Guard #3137 begins shift\r\n" + 
				"[1518-08-02 00:00] Guard #3547 begins shift\r\n" + 
				"[1518-02-15 00:15] wakes up\r\n" + 
				"[1518-07-28 00:03] falls asleep\r\n" + 
				"[1518-06-20 00:56] wakes up\r\n" + 
				"[1518-06-17 00:40] wakes up\r\n" + 
				"[1518-07-25 00:53] wakes up\r\n" + 
				"[1518-02-28 00:19] falls asleep\r\n" + 
				"[1518-03-19 23:51] Guard #2161 begins shift\r\n" + 
				"[1518-03-26 00:52] wakes up\r\n" + 
				"[1518-09-07 00:04] Guard #113 begins shift\r\n" + 
				"[1518-10-30 00:20] wakes up\r\n" + 
				"[1518-05-09 00:02] Guard #3137 begins shift\r\n" + 
				"[1518-11-19 00:22] wakes up\r\n" + 
				"[1518-10-30 00:40] wakes up\r\n" + 
				"[1518-03-14 00:04] falls asleep\r\n" + 
				"[1518-03-10 23:59] Guard #1993 begins shift\r\n" + 
				"[1518-11-05 00:58] wakes up\r\n" + 
				"[1518-07-27 00:37] falls asleep\r\n" + 
				"[1518-05-03 23:57] Guard #1709 begins shift\r\n" + 
				"[1518-08-17 00:48] wakes up\r\n" + 
				"[1518-04-09 00:16] falls asleep\r\n" + 
				"[1518-07-11 00:48] wakes up\r\n" + 
				"[1518-05-06 00:08] falls asleep\r\n" + 
				"[1518-04-21 00:56] falls asleep\r\n" + 
				"[1518-03-23 00:08] falls asleep\r\n" + 
				"[1518-03-28 00:10] falls asleep\r\n" + 
				"[1518-06-30 00:50] wakes up\r\n" + 
				"[1518-07-11 00:38] falls asleep\r\n" + 
				"[1518-02-20 00:59] wakes up\r\n" + 
				"[1518-02-12 00:53] falls asleep\r\n" + 
				"[1518-08-11 00:30] falls asleep\r\n" + 
				"[1518-10-12 00:49] wakes up\r\n" + 
				"[1518-06-22 00:32] wakes up\r\n" + 
				"[1518-04-14 00:01] Guard #229 begins shift\r\n" + 
				"[1518-05-06 00:31] wakes up\r\n" + 
				"[1518-03-05 00:47] falls asleep\r\n" + 
				"[1518-05-19 00:37] wakes up\r\n" + 
				"[1518-10-14 00:36] falls asleep\r\n" + 
				"[1518-06-18 00:46] falls asleep\r\n" + 
				"[1518-03-24 00:18] falls asleep\r\n" + 
				"[1518-10-14 00:49] wakes up\r\n" + 
				"[1518-05-16 00:01] falls asleep\r\n" + 
				"[1518-06-05 00:40] wakes up\r\n" + 
				"[1518-11-19 00:58] wakes up\r\n" + 
				"[1518-03-01 00:30] falls asleep\r\n" + 
				"[1518-03-03 00:26] falls asleep\r\n" + 
				"[1518-06-22 00:21] falls asleep\r\n" + 
				"[1518-10-21 00:00] Guard #2713 begins shift\r\n" + 
				"[1518-05-07 00:04] Guard #3323 begins shift\r\n" + 
				"[1518-08-15 00:29] wakes up\r\n" + 
				"[1518-03-31 23:58] Guard #2749 begins shift\r\n" + 
				"[1518-06-16 23:50] Guard #3323 begins shift\r\n" + 
				"[1518-05-09 00:25] falls asleep\r\n" + 
				"[1518-04-11 00:56] wakes up\r\n" + 
				"[1518-07-05 00:50] falls asleep\r\n" + 
				"[1518-03-29 00:09] falls asleep\r\n" + 
				"[1518-03-18 00:35] wakes up\r\n" + 
				"[1518-04-25 00:21] falls asleep\r\n" + 
				"[1518-06-27 00:46] falls asleep\r\n" + 
				"[1518-06-07 23:51] Guard #311 begins shift\r\n" + 
				"[1518-11-12 00:04] Guard #3137 begins shift\r\n" + 
				"[1518-03-17 00:55] wakes up\r\n" + 
				"[1518-05-10 00:03] falls asleep\r\n" + 
				"[1518-07-27 00:47] wakes up\r\n" + 
				"[1518-06-28 00:41] wakes up\r\n" + 
				"[1518-05-27 00:59] wakes up\r\n" + 
				"[1518-03-25 00:29] falls asleep\r\n" + 
				"[1518-10-01 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-02-24 00:04] falls asleep\r\n" + 
				"[1518-04-29 00:08] falls asleep\r\n" + 
				"[1518-04-22 00:02] Guard #2713 begins shift\r\n" + 
				"[1518-11-15 23:59] Guard #3137 begins shift\r\n" + 
				"[1518-07-26 00:04] Guard #2221 begins shift\r\n" + 
				"[1518-10-08 00:01] Guard #2749 begins shift\r\n" + 
				"[1518-03-15 00:56] wakes up\r\n" + 
				"[1518-05-16 00:41] wakes up\r\n" + 
				"[1518-08-14 00:43] wakes up\r\n" + 
				"[1518-07-15 00:51] wakes up\r\n" + 
				"[1518-09-13 00:09] falls asleep\r\n" + 
				"[1518-07-08 00:12] falls asleep\r\n" + 
				"[1518-05-27 00:18] falls asleep\r\n" + 
				"[1518-04-16 00:04] Guard #1993 begins shift\r\n" + 
				"[1518-03-27 00:55] wakes up\r\n" + 
				"[1518-05-30 00:18] wakes up\r\n" + 
				"[1518-10-25 00:06] falls asleep\r\n" + 
				"[1518-10-10 23:56] Guard #113 begins shift\r\n" + 
				"[1518-04-28 00:02] Guard #1637 begins shift\r\n" + 
				"[1518-04-25 00:04] Guard #3547 begins shift\r\n" + 
				"[1518-02-23 00:12] falls asleep\r\n" + 
				"[1518-07-07 00:15] wakes up\r\n" + 
				"[1518-03-28 00:40] wakes up\r\n" + 
				"[1518-11-09 00:48] wakes up\r\n" + 
				"[1518-11-23 00:03] Guard #2399 begins shift\r\n" + 
				"[1518-10-17 00:38] falls asleep\r\n" + 
				"[1518-09-15 00:44] wakes up\r\n" + 
				"[1518-02-20 00:40] wakes up\r\n" + 
				"[1518-11-19 23:46] Guard #113 begins shift\r\n" + 
				"[1518-03-14 00:23] wakes up\r\n" + 
				"[1518-06-23 23:52] Guard #2399 begins shift\r\n" + 
				"[1518-03-07 00:58] wakes up\r\n" + 
				"[1518-04-29 23:49] Guard #311 begins shift\r\n" + 
				"[1518-06-25 00:43] wakes up\r\n" + 
				"[1518-05-21 00:00] Guard #1613 begins shift\r\n" + 
				"[1518-11-20 00:01] falls asleep\r\n" + 
				"[1518-10-28 00:21] falls asleep\r\n" + 
				"[1518-10-04 00:34] wakes up\r\n" + 
				"[1518-07-01 00:45] wakes up\r\n" + 
				"[1518-06-01 00:54] wakes up\r\n" + 
				"[1518-02-27 00:41] wakes up\r\n" + 
				"[1518-07-10 00:54] wakes up\r\n" + 
				"[1518-05-18 00:37] falls asleep\r\n" + 
				"[1518-10-14 00:18] wakes up\r\n" + 
				"[1518-03-04 00:26] wakes up\r\n" + 
				"[1518-06-09 00:44] falls asleep\r\n" + 
				"[1518-08-22 00:28] falls asleep\r\n" + 
				"[1518-07-21 00:01] Guard #2749 begins shift\r\n" + 
				"[1518-09-17 00:54] wakes up\r\n" + 
				"[1518-03-04 00:59] wakes up\r\n" + 
				"[1518-04-11 00:02] falls asleep\r\n" + 
				"[1518-04-17 23:58] Guard #1327 begins shift\r\n" + 
				"[1518-06-11 00:31] wakes up\r\n" + 
				"[1518-05-24 00:34] wakes up\r\n" + 
				"[1518-04-02 23:46] Guard #2221 begins shift\r\n" + 
				"[1518-08-25 23:59] Guard #229 begins shift\r\n" + 
				"[1518-09-10 00:50] falls asleep\r\n" + 
				"[1518-09-11 00:44] falls asleep\r\n" + 
				"[1518-11-13 00:50] wakes up\r\n" + 
				"[1518-10-31 00:42] falls asleep\r\n" + 
				"[1518-03-31 00:24] falls asleep\r\n" + 
				"[1518-03-19 00:53] falls asleep\r\n" + 
				"[1518-04-04 00:27] falls asleep\r\n" + 
				"[1518-09-28 00:16] wakes up\r\n" + 
				"[1518-07-01 00:51] falls asleep\r\n" + 
				"[1518-11-05 00:18] falls asleep\r\n" + 
				"[1518-03-13 00:59] wakes up\r\n" + 
				"[1518-08-21 00:56] falls asleep\r\n" + 
				"[1518-11-09 00:51] falls asleep\r\n" + 
				"[1518-02-20 00:56] falls asleep\r\n" + 
				"[1518-06-26 23:56] Guard #2399 begins shift\r\n" + 
				"[1518-10-29 00:00] Guard #1093 begins shift\r\n" + 
				"[1518-03-03 00:54] wakes up\r\n" + 
				"[1518-06-21 00:00] Guard #3323 begins shift\r\n" + 
				"[1518-08-28 00:47] falls asleep\r\n" + 
				"[1518-11-01 23:58] Guard #1993 begins shift\r\n" + 
				"[1518-08-19 23:58] Guard #1993 begins shift\r\n" + 
				"[1518-08-04 00:39] falls asleep\r\n" + 
				"[1518-03-05 00:50] wakes up\r\n" + 
				"[1518-04-11 00:21] falls asleep\r\n" + 
				"[1518-05-11 23:52] Guard #2749 begins shift\r\n" + 
				"[1518-03-21 23:56] Guard #1327 begins shift\r\n" + 
				"[1518-02-11 00:55] wakes up\r\n" + 
				"[1518-03-29 23:47] Guard #1993 begins shift\r\n" + 
				"[1518-10-18 00:51] falls asleep\r\n" + 
				"[1518-02-11 00:42] falls asleep\r\n" + 
				"[1518-08-09 00:49] wakes up\r\n" + 
				"[1518-02-23 00:48] wakes up\r\n" + 
				"[1518-11-09 00:56] wakes up\r\n" + 
				"[1518-04-15 00:28] wakes up\r\n" + 
				"[1518-08-25 00:50] falls asleep\r\n" + 
				"[1518-10-09 00:03] Guard #2713 begins shift\r\n" + 
				"[1518-11-20 00:46] wakes up\r\n" + 
				"[1518-10-26 00:53] wakes up\r\n" + 
				"[1518-04-24 00:44] wakes up\r\n" + 
				"[1518-07-02 00:33] wakes up\r\n" + 
				"[1518-09-29 00:13] falls asleep\r\n" + 
				"[1518-02-24 00:41] wakes up\r\n" + 
				"[1518-07-05 00:55] wakes up\r\n" + 
				"[1518-09-19 00:52] falls asleep\r\n" + 
				"[1518-09-01 00:03] Guard #311 begins shift\r\n" + 
				"[1518-08-11 00:57] falls asleep\r\n" + 
				"[1518-06-12 00:10] falls asleep\r\n" + 
				"[1518-07-13 00:35] falls asleep\r\n" + 
				"[1518-03-06 00:02] Guard #3323 begins shift\r\n" + 
				"[1518-05-28 00:55] wakes up\r\n" + 
				"[1518-06-04 00:59] wakes up\r\n" + 
				"[1518-06-11 00:00] Guard #2399 begins shift\r\n" + 
				"[1518-08-30 00:27] wakes up\r\n" + 
				"[1518-08-29 00:31] falls asleep\r\n" + 
				"[1518-08-21 00:57] wakes up\r\n" + 
				"[1518-06-12 00:46] falls asleep\r\n" + 
				"[1518-11-20 00:38] falls asleep\r\n" + 
				"[1518-09-21 00:35] falls asleep\r\n" + 
				"[1518-02-25 00:37] wakes up\r\n" + 
				"[1518-03-15 00:24] falls asleep\r\n" + 
				"[1518-08-18 00:54] falls asleep\r\n" + 
				"[1518-06-12 23:58] Guard #1093 begins shift\r\n" + 
				"[1518-02-22 00:30] falls asleep\r\n" + 
				"[1518-02-13 00:32] falls asleep\r\n" + 
				"[1518-03-16 00:54] wakes up\r\n" + 
				"[1518-08-24 00:29] falls asleep\r\n" + 
				"[1518-03-31 00:46] wakes up\r\n" + 
				"[1518-10-25 00:56] falls asleep\r\n" + 
				"[1518-03-01 00:37] wakes up\r\n" + 
				"[1518-04-14 00:41] falls asleep\r\n" + 
				"[1518-07-13 23:58] Guard #1093 begins shift\r\n" + 
				"[1518-04-29 00:53] wakes up\r\n" + 
				"[1518-04-07 23:56] Guard #2749 begins shift\r\n" + 
				"[1518-04-21 00:27] wakes up\r\n" + 
				"[1518-05-04 00:26] falls asleep\r\n" + 
				"[1518-07-25 00:37] wakes up\r\n" + 
				"[1518-05-29 00:00] Guard #1093 begins shift\r\n" + 
				"[1518-07-30 00:44] falls asleep\r\n" + 
				"[1518-04-27 00:42] wakes up\r\n" + 
				"[1518-09-09 00:16] falls asleep\r\n" + 
				"[1518-09-15 00:02] falls asleep\r\n" + 
				"[1518-09-19 00:57] wakes up\r\n" + 
				"[1518-07-06 00:04] Guard #3491 begins shift\r\n" + 
				"[1518-04-28 00:58] wakes up\r\n" + 
				"[1518-08-05 00:10] wakes up\r\n" + 
				"[1518-06-13 00:59] wakes up\r\n" + 
				"[1518-08-07 00:22] wakes up\r\n" + 
				"[1518-09-30 00:44] falls asleep\r\n" + 
				"[1518-03-03 00:59] wakes up\r\n" + 
				"[1518-04-22 23:59] Guard #3137 begins shift\r\n" + 
				"[1518-02-11 00:25] falls asleep\r\n" + 
				"[1518-09-14 00:41] wakes up\r\n" + 
				"[1518-11-09 00:37] wakes up\r\n" + 
				"[1518-10-03 00:19] falls asleep\r\n" + 
				"[1518-06-20 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-11-13 00:31] falls asleep\r\n" + 
				"[1518-07-14 00:43] wakes up\r\n" + 
				"[1518-03-01 00:47] falls asleep\r\n" + 
				"[1518-07-15 00:57] falls asleep\r\n" + 
				"[1518-08-19 00:00] Guard #2749 begins shift\r\n" + 
				"[1518-03-03 00:50] falls asleep\r\n" + 
				"[1518-03-30 00:04] falls asleep\r\n" + 
				"[1518-11-08 00:57] falls asleep\r\n" + 
				"[1518-03-31 00:39] falls asleep\r\n" + 
				"[1518-11-06 00:53] wakes up\r\n" + 
				"[1518-02-17 00:40] wakes up\r\n" + 
				"[1518-05-31 00:05] falls asleep\r\n" + 
				"[1518-10-31 00:48] wakes up\r\n" + 
				"[1518-10-02 00:50] falls asleep\r\n" + 
				"[1518-02-10 00:23] wakes up\r\n" + 
				"[1518-07-18 00:55] wakes up\r\n" + 
				"[1518-06-22 00:29] falls asleep\r\n" + 
				"[1518-03-29 00:43] wakes up\r\n" + 
				"[1518-04-09 00:59] wakes up\r\n" + 
				"[1518-11-12 23:51] Guard #113 begins shift\r\n" + 
				"[1518-07-02 00:54] wakes up\r\n" + 
				"[1518-06-09 00:04] Guard #2221 begins shift\r\n" + 
				"[1518-06-21 00:34] wakes up\r\n" + 
				"[1518-03-07 00:52] falls asleep\r\n" + 
				"[1518-11-08 00:53] wakes up\r\n" + 
				"[1518-07-10 00:48] falls asleep\r\n" + 
				"[1518-07-09 00:28] falls asleep\r\n" + 
				"[1518-09-25 00:10] falls asleep\r\n" + 
				"[1518-04-26 00:04] Guard #2383 begins shift\r\n" + 
				"[1518-03-25 00:50] wakes up\r\n" + 
				"[1518-07-15 00:19] wakes up\r\n" + 
				"[1518-10-05 00:02] Guard #1709 begins shift\r\n" + 
				"[1518-08-12 23:59] Guard #2713 begins shift\r\n" + 
				"[1518-10-31 23:57] Guard #2713 begins shift\r\n" + 
				"[1518-06-03 23:57] Guard #2713 begins shift\r\n" + 
				"[1518-09-06 00:03] falls asleep\r\n" + 
				"[1518-11-23 00:42] falls asleep\r\n" + 
				"[1518-03-13 00:53] falls asleep\r\n" + 
				"[1518-05-24 23:59] Guard #2293 begins shift\r\n" + 
				"[1518-03-03 00:45] wakes up\r\n" + 
				"[1518-11-09 00:29] falls asleep\r\n" + 
				"[1518-08-12 00:54] wakes up\r\n" + 
				"[1518-11-13 00:57] falls asleep\r\n" + 
				"[1518-08-16 00:04] falls asleep\r\n" + 
				"[1518-10-02 00:56] wakes up\r\n" + 
				"[1518-10-10 00:36] wakes up\r\n" + 
				"[1518-05-03 00:29] wakes up\r\n" + 
				"[1518-03-17 00:42] wakes up\r\n" + 
				"[1518-05-18 00:41] wakes up\r\n" + 
				"[1518-06-06 23:56] Guard #229 begins shift\r\n" + 
				"[1518-09-28 00:15] falls asleep\r\n" + 
				"[1518-05-07 00:58] wakes up\r\n" + 
				"[1518-06-09 00:12] falls asleep\r\n" + 
				"[1518-08-13 00:51] wakes up\r\n" + 
				"[1518-06-04 00:57] falls asleep\r\n" + 
				"[1518-02-11 23:50] Guard #113 begins shift\r\n" + 
				"[1518-08-01 00:00] Guard #3491 begins shift\r\n" + 
				"[1518-10-17 00:45] wakes up\r\n" + 
				"[1518-05-07 23:49] Guard #113 begins shift\r\n" + 
				"[1518-11-16 00:45] falls asleep\r\n" + 
				"[1518-06-03 00:55] wakes up\r\n" + 
				"[1518-05-05 00:49] falls asleep\r\n" + 
				"[1518-11-17 23:50] Guard #811 begins shift\r\n" + 
				"[1518-07-09 23:56] Guard #1613 begins shift\r\n" + 
				"[1518-07-06 23:58] Guard #1093 begins shift\r\n" + 
				"[1518-05-13 00:18] falls asleep\r\n" + 
				"[1518-07-21 00:12] falls asleep\r\n" + 
				"[1518-10-04 00:02] Guard #3323 begins shift\r\n" + 
				"[1518-04-04 00:04] Guard #229 begins shift\r\n" + 
				"[1518-07-26 00:59] wakes up\r\n" + 
				"[1518-04-05 00:56] wakes up\r\n" + 
				"[1518-04-19 00:59] wakes up\r\n" + 
				"[1518-10-09 23:47] Guard #3323 begins shift\r\n" + 
				"[1518-03-20 00:49] falls asleep\r\n" + 
				"[1518-11-12 00:55] falls asleep\r\n" + 
				"[1518-08-12 00:00] Guard #3137 begins shift\r\n" + 
				"[1518-03-11 00:22] falls asleep\r\n" + 
				"[1518-09-18 00:35] falls asleep\r\n" + 
				"[1518-03-26 00:02] Guard #811 begins shift\r\n" + 
				"[1518-07-04 23:57] Guard #3323 begins shift\r\n" + 
				"[1518-08-03 00:36] wakes up\r\n" + 
				"[1518-07-10 00:39] wakes up\r\n" + 
				"[1518-03-22 00:51] wakes up\r\n" + 
				"[1518-11-12 00:45] wakes up\r\n" + 
				"[1518-10-02 00:46] wakes up\r\n" + 
				"[1518-02-10 00:19] falls asleep\r\n" + 
				"[1518-04-14 00:55] wakes up\r\n" + 
				"[1518-06-11 00:16] falls asleep\r\n" + 
				"[1518-11-21 00:12] wakes up\r\n" + 
				"[1518-08-06 00:14] wakes up\r\n" + 
				"[1518-07-03 23:59] Guard #3547 begins shift\r\n" + 
				"[1518-08-29 00:47] wakes up\r\n" + 
				"[1518-06-25 00:47] falls asleep\r\n" + 
				"[1518-10-15 00:34] falls asleep\r\n" + 
				"[1518-09-08 00:04] Guard #2383 begins shift\r\n" + 
				"[1518-09-28 00:29] wakes up\r\n" + 
				"[1518-02-10 00:01] Guard #1637 begins shift\r\n" + 
				"[1518-08-26 00:47] wakes up\r\n" + 
				"[1518-06-19 00:00] Guard #2293 begins shift\r\n" + 
				"[1518-05-30 00:45] wakes up\r\n" + 
				"[1518-02-13 23:48] Guard #3491 begins shift\r\n" + 
				"[1518-04-18 00:53] falls asleep\r\n" + 
				"[1518-06-12 00:01] Guard #1993 begins shift\r\n" + 
				"[1518-08-05 00:04] falls asleep\r\n" + 
				"[1518-07-27 23:53] Guard #3323 begins shift\r\n" + 
				"[1518-03-26 00:14] falls asleep\r\n" + 
				"[1518-06-05 00:49] falls asleep\r\n" + 
				"[1518-10-25 00:28] wakes up\r\n" + 
				"[1518-10-16 00:04] Guard #3491 begins shift\r\n" + 
				"[1518-04-21 00:03] Guard #1327 begins shift\r\n" + 
				"[1518-08-04 00:54] falls asleep\r\n" + 
				"[1518-09-06 00:36] falls asleep\r\n" + 
				"[1518-11-06 00:02] Guard #2293 begins shift\r\n" + 
				"[1518-05-30 23:52] Guard #2399 begins shift\r\n" + 
				"[1518-06-05 00:02] falls asleep\r\n" + 
				"[1518-10-20 00:45] falls asleep\r\n" + 
				"[1518-05-13 00:20] wakes up\r\n" + 
				"[1518-06-12 00:58] wakes up\r\n" + 
				"[1518-10-31 00:54] falls asleep\r\n" + 
				"[1518-06-17 00:02] falls asleep\r\n" + 
				"[1518-10-01 00:12] falls asleep\r\n" + 
				"[1518-04-08 00:08] falls asleep\r\n" + 
				"[1518-03-31 00:30] wakes up\r\n" + 
				"[1518-09-28 00:25] falls asleep\r\n" + 
				"[1518-07-07 00:11] falls asleep\r\n" + 
				"[1518-02-27 00:02] Guard #2399 begins shift\r\n" + 
				"[1518-09-17 00:02] Guard #1637 begins shift\r\n" + 
				"[1518-11-19 00:13] falls asleep\r\n" + 
				"[1518-07-09 00:03] Guard #2713 begins shift\r\n" + 
				"[1518-02-14 00:37] wakes up\r\n" + 
				"[1518-08-04 00:26] wakes up\r\n" + 
				"[1518-02-17 00:30] falls asleep\r\n" + 
				"[1518-08-30 00:37] falls asleep\r\n" + 
				"[1518-04-22 00:37] falls asleep\r\n" + 
				"[1518-03-21 00:16] falls asleep\r\n" + 
				"[1518-06-30 00:46] falls asleep\r\n" + 
				"[1518-07-30 00:01] falls asleep\r\n" + 
				"[1518-07-09 00:42] wakes up\r\n" + 
				"[1518-07-08 00:42] wakes up\r\n" + 
				"[1518-08-19 00:31] wakes up\r\n" + 
				"[1518-08-13 00:35] falls asleep\r\n" + 
				"[1518-09-04 00:00] falls asleep\r\n" + 
				"[1518-06-22 00:26] wakes up\r\n" + 
				"[1518-04-21 00:57] wakes up\r\n" + 
				"[1518-08-30 00:24] falls asleep\r\n" + 
				"[1518-09-22 00:00] Guard #3323 begins shift\r\n" + 
				"[1518-05-18 00:56] wakes up\r\n" + 
				"[1518-09-20 00:40] wakes up\r\n" + 
				"[1518-08-06 00:19] falls asleep\r\n" + 
				"[1518-08-14 00:03] Guard #2749 begins shift\r\n" + 
				"[1518-03-17 00:23] falls asleep\r\n" + 
				"[1518-09-05 00:51] falls asleep\r\n" + 
				"[1518-07-26 00:54] falls asleep\r\n" + 
				"[1518-03-16 23:47] Guard #2161 begins shift\r\n" + 
				"[1518-11-13 00:03] falls asleep\r\n" + 
				"[1518-02-12 00:00] falls asleep\r\n" + 
				"[1518-11-19 00:52] falls asleep\r\n" + 
				"[1518-10-17 00:00] Guard #1093 begins shift\r\n" + 
				"[1518-09-11 00:59] wakes up\r\n" + 
				"[1518-03-09 00:06] falls asleep\r\n" + 
				"[1518-11-17 00:25] falls asleep\r\n" + 
				"[1518-10-03 00:03] wakes up\r\n" + 
				"[1518-11-13 23:59] Guard #1559 begins shift\r\n" + 
				"[1518-05-31 00:47] wakes up\r\n" + 
				"[1518-06-08 00:05] falls asleep\r\n" + 
				"[1518-10-19 00:18] falls asleep\r\n" + 
				"[1518-10-22 00:29] falls asleep\r\n" + 
				"[1518-07-30 00:36] wakes up\r\n" + 
				"[1518-07-15 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-03-08 00:46] falls asleep\r\n" + 
				"[1518-02-21 00:01] falls asleep\r\n" + 
				"[1518-10-28 00:50] falls asleep\r\n" + 
				"[1518-10-06 00:58] wakes up\r\n" + 
				"[1518-05-16 00:50] wakes up\r\n" + 
				"[1518-11-08 00:59] wakes up\r\n" + 
				"[1518-04-12 00:29] falls asleep\r\n" + 
				"[1518-11-23 00:57] falls asleep\r\n" + 
				"[1518-08-15 00:39] falls asleep\r\n" + 
				"[1518-06-21 00:58] wakes up\r\n" + 
				"[1518-02-14 00:00] falls asleep\r\n" + 
				"[1518-07-12 00:54] falls asleep\r\n" + 
				"[1518-02-16 00:46] wakes up\r\n" + 
				"[1518-08-24 23:51] Guard #3491 begins shift\r\n" + 
				"[1518-10-01 00:23] wakes up\r\n" + 
				"[1518-04-12 00:56] wakes up\r\n" + 
				"[1518-07-03 00:38] falls asleep\r\n" + 
				"[1518-08-16 00:33] wakes up\r\n" + 
				"[1518-07-13 00:58] wakes up\r\n" + 
				"[1518-02-22 00:42] falls asleep\r\n" + 
				"[1518-11-01 00:42] falls asleep\r\n" + 
				"[1518-08-15 00:00] Guard #1327 begins shift\r\n" + 
				"[1518-09-13 00:22] falls asleep\r\n" + 
				"[1518-06-28 00:12] falls asleep\r\n" + 
				"[1518-05-29 00:10] falls asleep\r\n" + 
				"[1518-03-11 00:28] wakes up\r\n" + 
				"[1518-04-09 00:02] Guard #3491 begins shift\r\n" + 
				"[1518-09-22 00:37] wakes up\r\n" + 
				"[1518-04-29 00:03] Guard #1637 begins shift\r\n" + 
				"[1518-11-08 00:00] Guard #2713 begins shift\r\n" + 
				"[1518-03-30 00:29] wakes up\r\n" + 
				"[1518-07-27 00:03] Guard #229 begins shift\r\n" + 
				"[1518-04-10 00:02] Guard #1613 begins shift\r\n" + 
				"[1518-05-15 23:53] Guard #2749 begins shift\r\n" + 
				"[1518-05-24 00:00] Guard #2293 begins shift\r\n" + 
				"[1518-02-20 00:32] falls asleep\r\n" + 
				"[1518-02-11 00:37] wakes up\r\n" + 
				"[1518-02-19 00:35] falls asleep\r\n" + 
				"[1518-03-30 00:55] falls asleep\r\n" + 
				"[1518-05-18 00:49] falls asleep\r\n" + 
				"[1518-04-15 00:10] falls asleep\r\n" + 
				"[1518-09-03 23:52] Guard #3491 begins shift\r\n" + 
				"[1518-03-12 00:06] falls asleep\r\n" + 
				"[1518-06-21 00:15] wakes up\r\n" + 
				"[1518-04-18 00:57] wakes up\r\n" + 
				"[1518-06-15 00:16] falls asleep\r\n" + 
				"[1518-05-10 00:40] falls asleep\r\n" + 
				"[1518-09-11 00:48] wakes up\r\n" + 
				"[1518-06-10 00:20] falls asleep\r\n" + 
				"[1518-07-29 23:53] Guard #113 begins shift\r\n" + 
				"[1518-03-23 00:22] wakes up\r\n" + 
				"[1518-09-29 00:52] falls asleep\r\n" + 
				"[1518-03-16 00:00] Guard #1993 begins shift\r\n" + 
				"[1518-06-19 00:31] falls asleep\r\n" + 
				"[1518-08-24 00:41] wakes up\r\n" + 
				"[1518-11-17 00:13] falls asleep\r\n" + 
				"[1518-07-15 00:46] falls asleep\r\n" + 
				"[1518-06-28 00:50] wakes up\r\n" + 
				"[1518-09-16 00:49] wakes up\r\n" + 
				"[1518-06-25 00:01] Guard #1093 begins shift\r\n" + 
				"[1518-09-01 00:24] falls asleep\r\n" + 
				"[1518-08-28 00:58] wakes up\r\n" + 
				"[1518-09-06 00:20] wakes up\r\n" + 
				"[1518-04-03 00:13] wakes up\r\n" + 
				"[1518-05-03 00:24] falls asleep\r\n" + 
				"[1518-09-23 00:07] wakes up\r\n" + 
				"[1518-07-17 00:16] falls asleep\r\n" + 
				"[1518-09-12 00:31] falls asleep\r\n" + 
				"[1518-05-10 00:58] wakes up\r\n" + 
				"[1518-06-10 00:55] wakes up\r\n" + 
				"[1518-04-27 00:05] falls asleep\r\n" + 
				"[1518-07-28 00:57] wakes up\r\n" + 
				"[1518-02-15 00:01] Guard #3547 begins shift\r\n" + 
				"[1518-08-25 00:56] wakes up\r\n" + 
				"[1518-10-26 00:18] falls asleep\r\n" + 
				"[1518-09-23 00:35] falls asleep\r\n" + 
				"[1518-05-10 00:20] falls asleep\r\n" + 
				"[1518-07-05 00:43] wakes up\r\n" + 
				"[1518-03-18 23:57] Guard #2749 begins shift\r\n" + 
				"[1518-08-04 23:54] Guard #1637 begins shift\r\n" + 
				"[1518-06-09 00:41] wakes up\r\n" + 
				"[1518-03-02 00:23] falls asleep\r\n" + 
				"[1518-03-09 00:59] wakes up\r\n" + 
				"[1518-02-14 00:42] falls asleep\r\n" + 
				"[1518-09-18 00:48] wakes up\r\n" + 
				"[1518-03-26 23:49] Guard #113 begins shift\r\n" + 
				"[1518-05-22 00:49] falls asleep\r\n" + 
				"[1518-05-09 00:49] wakes up\r\n" + 
				"[1518-06-19 00:27] wakes up\r\n" + 
				"[1518-07-02 00:59] wakes up\r\n" + 
				"[1518-08-06 00:01] falls asleep\r\n" + 
				"[1518-06-21 23:56] Guard #1327 begins shift\r\n" + 
				"[1518-05-14 00:02] Guard #2161 begins shift\r\n" + 
				"[1518-10-05 00:40] falls asleep\r\n" + 
				"[1518-06-17 23:56] Guard #2399 begins shift\r\n" + 
				"[1518-05-20 00:58] wakes up\r\n" + 
				"[1518-06-07 00:43] wakes up\r\n" + 
				"[1518-11-15 00:04] Guard #1483 begins shift\r\n" + 
				"[1518-02-23 00:04] Guard #3491 begins shift\r\n" + 
				"[1518-11-21 00:43] falls asleep\r\n" + 
				"[1518-08-21 00:51] wakes up\r\n" + 
				"[1518-08-27 00:58] wakes up\r\n" + 
				"[1518-06-14 00:41] falls asleep\r\n" + 
				"[1518-02-19 23:58] Guard #3137 begins shift\r\n" + 
				"[1518-10-21 00:38] wakes up\r\n" + 
				"[1518-10-24 00:04] Guard #2399 begins shift\r\n" + 
				"[1518-07-02 00:00] Guard #1327 begins shift\r\n" + 
				"[1518-08-31 00:39] falls asleep\r\n" + 
				"[1518-07-23 23:57] Guard #2713 begins shift\r\n" + 
				"[1518-06-23 00:43] wakes up\r\n" + 
				"[1518-03-30 00:42] falls asleep\r\n" + 
				"[1518-10-10 00:40] falls asleep\r\n" + 
				"[1518-04-15 00:00] Guard #1093 begins shift\r\n" + 
				"[1518-07-04 00:15] falls asleep\r\n" + 
				"[1518-07-22 00:07] falls asleep\r\n" + 
				"[1518-06-02 00:02] Guard #2399 begins shift\r\n" + 
				"[1518-06-30 00:23] falls asleep\r\n" + 
				"[1518-11-17 00:47] wakes up\r\n" + 
				"[1518-10-27 00:01] Guard #2161 begins shift\r\n" + 
				"[1518-10-17 23:57] Guard #3323 begins shift\r\n" + 
				"[1518-06-09 00:55] wakes up\r\n" + 
				"[1518-03-30 00:51] wakes up\r\n" + 
				"[1518-10-28 00:53] wakes up\r\n" + 
				"[1518-05-08 00:05] falls asleep\r\n" + 
				"[1518-04-17 00:27] falls asleep\r\n" + 
				"[1518-11-18 00:57] wakes up\r\n" + 
				"[1518-10-13 00:59] wakes up\r\n" + 
				"[1518-07-15 00:14] falls asleep\r\n" + 
				"[1518-06-28 00:14] wakes up\r\n" + 
				"[1518-08-15 00:52] wakes up\r\n" + 
				"[1518-05-01 00:53] wakes up\r\n" + 
				"[1518-09-23 00:03] falls asleep\r\n" + 
				"[1518-05-28 00:35] falls asleep\r\n" + 
				"[1518-10-22 00:54] wakes up\r\n" + 
				"[1518-02-22 00:55] wakes up\r\n" + 
				"[1518-09-19 23:58] Guard #113 begins shift\r\n" + 
				"[1518-05-11 00:00] Guard #2399 begins shift\r\n" + 
				"[1518-10-19 00:51] wakes up\r\n" + 
				"[1518-03-29 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-09-11 00:52] falls asleep\r\n" + 
				"[1518-08-08 00:23] falls asleep\r\n" + 
				"[1518-09-13 00:18] wakes up\r\n" + 
				"[1518-10-07 00:08] falls asleep\r\n" + 
				"[1518-09-29 00:46] wakes up\r\n" + 
				"[1518-06-28 00:46] falls asleep\r\n" + 
				"[1518-11-20 00:52] wakes up\r\n" + 
				"[1518-02-18 00:29] wakes up\r\n" + 
				"[1518-06-12 00:25] wakes up\r\n" + 
				"[1518-09-04 00:53] wakes up\r\n" + 
				"[1518-10-30 00:25] falls asleep\r\n" + 
				"[1518-06-20 00:11] falls asleep\r\n" + 
				"[1518-08-18 00:57] wakes up\r\n" + 
				"[1518-10-25 00:59] wakes up\r\n" + 
				"[1518-08-02 00:58] wakes up\r\n" + 
				"[1518-11-13 00:12] wakes up\r\n" + 
				"[1518-06-02 23:57] Guard #1327 begins shift\r\n" + 
				"[1518-03-06 00:59] wakes up\r\n" + 
				"[1518-07-06 00:24] wakes up\r\n" + 
				"[1518-11-10 23:48] Guard #2749 begins shift\r\n" + 
				"[1518-05-07 00:30] falls asleep\r\n" + 
				"[1518-09-26 00:02] Guard #1993 begins shift\r\n" + 
				"[1518-10-09 00:54] falls asleep\r\n" + 
				"[1518-10-27 00:28] falls asleep\r\n" + 
				"[1518-11-23 00:52] wakes up\r\n" + 
				"[1518-04-16 00:38] falls asleep\r\n" + 
				"[1518-09-05 23:46] Guard #2749 begins shift\r\n" + 
				"[1518-02-25 00:47] falls asleep\r\n" + 
				"[1518-06-06 00:18] falls asleep\r\n" + 
				"[1518-11-07 00:37] falls asleep\r\n" + 
				"[1518-03-30 23:58] Guard #3137 begins shift\r\n" + 
				"[1518-03-08 00:58] wakes up\r\n" + 
				"[1518-08-01 00:58] wakes up\r\n" + 
				"[1518-05-20 00:50] falls asleep\r\n" + 
				"[1518-11-04 00:00] Guard #3323 begins shift\r\n" + 
				"[1518-04-24 00:23] wakes up\r\n" + 
				"[1518-07-30 23:49] Guard #2293 begins shift\r\n" + 
				"[1518-05-04 00:45] wakes up\r\n" + 
				"[1518-07-07 00:49] wakes up\r\n" + 
				"[1518-05-30 00:00] Guard #2749 begins shift\r\n" + 
				"[1518-07-23 00:45] wakes up\r\n" + 
				"[1518-06-27 00:15] falls asleep\r\n" + 
				"[1518-03-24 00:27] wakes up\r\n" + 
				"[1518-04-12 23:58] Guard #2221 begins shift\r\n" + 
				"[1518-04-10 00:57] wakes up\r\n" + 
				"[1518-11-03 00:17] falls asleep\r\n" + 
				"[1518-03-04 00:44] falls asleep\r\n" + 
				"[1518-08-14 00:15] falls asleep\r\n" + 
				"[1518-05-12 00:35] wakes up\r\n" + 
				"[1518-05-24 00:40] falls asleep\r\n" + 
				"[1518-05-05 00:54] wakes up\r\n" + 
				"[1518-07-20 00:51] wakes up\r\n" + 
				"[1518-06-15 00:01] Guard #1327 begins shift\r\n" + 
				"[1518-03-17 00:12] wakes up\r\n" + 
				"[1518-09-11 00:14] falls asleep\r\n" + 
				"[1518-04-10 00:45] wakes up\r\n" + 
				"[1518-11-02 00:48] falls asleep\r\n" + 
				"[1518-04-06 00:04] Guard #3137 begins shift\r\n" + 
				"[1518-08-30 00:43] wakes up\r\n" + 
				"[1518-05-27 23:56] Guard #1613 begins shift\r\n" + 
				"[1518-07-06 00:59] wakes up\r\n" + 
				"[1518-09-30 00:55] wakes up\r\n" + 
				"[1518-07-26 00:40] wakes up\r\n" + 
				"[1518-03-16 00:38] wakes up\r\n" + 
				"[1518-09-22 23:48] Guard #1327 begins shift\r\n" + 
				"[1518-09-27 23:58] Guard #2713 begins shift\r\n" + 
				"[1518-04-30 00:38] falls asleep\r\n" + 
				"[1518-08-10 00:39] falls asleep\r\n" + 
				"[1518-08-04 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-02-19 00:04] falls asleep\r\n" + 
				"[1518-05-19 00:42] falls asleep\r\n" + 
				"[1518-09-26 00:14] falls asleep\r\n" + 
				"[1518-05-29 00:11] wakes up\r\n" + 
				"[1518-11-22 00:19] falls asleep\r\n" + 
				"[1518-04-28 00:40] wakes up\r\n" + 
				"[1518-07-22 23:47] Guard #1709 begins shift\r\n" + 
				"[1518-03-28 00:13] wakes up\r\n" + 
				"[1518-08-09 23:56] Guard #1327 begins shift\r\n" + 
				"[1518-09-07 00:27] falls asleep\r\n" + 
				"[1518-02-19 00:58] wakes up\r\n" + 
				"[1518-09-27 00:47] wakes up\r\n" + 
				"[1518-11-09 00:43] falls asleep\r\n" + 
				"[1518-03-27 00:05] falls asleep\r\n" + 
				"[1518-03-17 00:54] falls asleep\r\n" + 
				"[1518-11-08 00:46] falls asleep\r\n" + 
				"[1518-11-05 00:51] falls asleep\r\n" + 
				"[1518-06-26 00:57] falls asleep\r\n" + 
				"[1518-03-25 00:04] Guard #3547 begins shift\r\n" + 
				"[1518-05-10 00:13] wakes up\r\n" + 
				"[1518-04-26 23:50] Guard #1327 begins shift\r\n" + 
				"[1518-11-11 00:43] wakes up\r\n" + 
				"[1518-06-19 00:55] wakes up\r\n" + 
				"[1518-07-18 23:58] Guard #1613 begins shift\r\n" + 
				"[1518-07-10 00:08] falls asleep\r\n" + 
				"[1518-11-21 23:56] Guard #3137 begins shift\r\n" + 
				"[1518-11-20 00:19] wakes up\r\n" + 
				"[1518-02-23 00:22] wakes up\r\n" + 
				"[1518-09-21 00:46] wakes up\r\n" + 
				"[1518-02-17 23:47] Guard #1093 begins shift\r\n" + 
				"[1518-06-16 00:49] wakes up\r\n" + 
				"[1518-04-25 00:57] wakes up\r\n" + 
				"[1518-04-02 00:53] falls asleep\r\n" + 
				"[1518-03-10 00:00] Guard #2399 begins shift\r\n" + 
				"[1518-05-06 00:45] wakes up\r\n" + 
				"[1518-07-14 00:14] falls asleep\r\n" + 
				"[1518-04-08 00:26] wakes up\r\n" + 
				"[1518-11-21 00:47] wakes up\r\n" + 
				"[1518-09-30 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-05-10 00:37] wakes up\r\n" + 
				"[1518-07-15 00:29] falls asleep\r\n" + 
				"[1518-05-25 23:50] Guard #229 begins shift\r\n" + 
				"[1518-09-19 00:03] falls asleep\r\n" + 
				"[1518-08-23 23:56] Guard #1709 begins shift\r\n" + 
				"[1518-11-10 00:01] Guard #811 begins shift\r\n" + 
				"[1518-11-12 00:34] falls asleep\r\n" + 
				"[1518-09-10 23:58] Guard #3323 begins shift\r\n" + 
				"[1518-05-05 00:04] falls asleep\r\n" + 
				"[1518-07-14 00:52] wakes up\r\n" + 
				"[1518-10-10 00:02] falls asleep\r\n" + 
				"[1518-07-10 23:56] Guard #2713 begins shift\r\n" + 
				"[1518-05-31 23:46] Guard #3323 begins shift\r\n" + 
				"[1518-07-24 00:37] wakes up\r\n" + 
				"[1518-05-22 00:00] Guard #1327 begins shift\r\n" + 
				"[1518-06-08 00:41] wakes up\r\n" + 
				"[1518-08-31 00:44] wakes up\r\n" + 
				"[1518-10-14 23:58] Guard #3547 begins shift\r\n" + 
				"[1518-09-13 23:59] Guard #311 begins shift\r\n" + 
				"[1518-08-03 00:05] falls asleep\r\n" + 
				"[1518-07-12 00:56] wakes up\r\n" + 
				"[1518-02-15 00:13] falls asleep\r\n" + 
				"[1518-02-20 23:54] Guard #3547 begins shift\r\n" + 
				"[1518-05-08 00:53] wakes up\r\n" + 
				"[1518-06-18 00:07] falls asleep\r\n" + 
				"[1518-04-18 23:57] Guard #1613 begins shift\r\n" + 
				"[1518-03-04 00:25] falls asleep\r\n" + 
				"[1518-09-29 00:00] Guard #3491 begins shift\r\n" + 
				"[1518-08-06 00:41] wakes up\r\n" + 
				"[1518-10-12 00:18] falls asleep\r\n" + 
				"[1518-08-07 00:20] falls asleep\r\n" + 
				"[1518-04-05 00:10] falls asleep\r\n" + 
				"[1518-05-30 00:26] falls asleep\r\n" + 
				"[1518-03-13 23:50] Guard #2399 begins shift\r\n" + 
				"[1518-05-12 00:00] falls asleep\r\n" + 
				"[1518-07-26 00:37] falls asleep\r\n" + 
				"[1518-07-01 00:14] falls asleep\r\n" + 
				"[1518-05-09 23:54] Guard #2399 begins shift\r\n" + 
				"[1518-05-19 00:49] falls asleep\r\n" + 
				"[1518-04-20 00:50] falls asleep\r\n" + 
				"[1518-05-14 00:49] wakes up\r\n" + 
				"[1518-09-30 00:34] wakes up\r\n" + 
				"[1518-08-21 23:56] Guard #811 begins shift\r\n" + 
				"[1518-08-27 00:18] falls asleep\r\n" + 
				"[1518-10-11 00:54] wakes up\r\n" + 
				"[1518-11-09 00:00] Guard #2293 begins shift\r\n" + 
				"[1518-11-18 00:00] falls asleep\r\n" + 
				"[1518-06-02 00:53] falls asleep\r\n" + 
				"[1518-08-02 00:22] falls asleep\r\n" + 
				"[1518-02-19 00:22] wakes up\r\n" + 
				"[1518-03-20 23:58] Guard #3547 begins shift\r\n" + 
				"[1518-11-17 00:03] Guard #811 begins shift\r\n" + 
				"[1518-02-12 00:56] wakes up\r\n" + 
				"[1518-10-12 23:53] Guard #311 begins shift\r\n" + 
				"[1518-02-21 00:25] wakes up\r\n" + 
				"[1518-03-21 00:47] wakes up\r\n" + 
				"[1518-04-05 00:02] Guard #3137 begins shift\r\n" + 
				"[1518-09-12 23:57] Guard #1093 begins shift\r\n" + 
				"[1518-09-26 00:46] wakes up\r\n" + 
				"[1518-05-27 00:01] Guard #3491 begins shift\r\n" + 
				"[1518-07-07 00:46] falls asleep\r\n" + 
				"[1518-08-31 00:21] wakes up\r\n" + 
				"[1518-10-31 00:58] wakes up\r\n" + 
				"[1518-04-14 00:13] falls asleep\r\n" + 
				"[1518-04-13 00:55] wakes up\r\n" + 
				"[1518-09-02 23:54] Guard #1613 begins shift\r\n" + 
				"[1518-08-15 00:08] falls asleep\r\n" + 
				"[1518-04-23 23:50] Guard #2221 begins shift\r\n" + 
				"[1518-08-05 00:23] falls asleep\r\n" + 
				"[1518-06-13 00:46] wakes up\r\n" + 
				"[1518-11-20 00:51] falls asleep\r\n" + 
				"[1518-10-27 00:54] wakes up\r\n" + 
				"[1518-07-01 00:53] wakes up\r\n" + 
				"[1518-07-25 00:03] Guard #1993 begins shift\r\n" + 
				"[1518-04-11 23:57] Guard #3323 begins shift\r\n" + 
				"[1518-07-31 00:05] falls asleep\r\n" + 
				"[1518-10-16 00:36] wakes up\r\n" + 
				"[1518-03-15 00:02] Guard #2399 begins shift\r\n" + 
				"[1518-09-19 00:27] wakes up\r\n" + 
				"[1518-08-10 23:56] Guard #2399 begins shift\r\n" + 
				"[1518-08-01 00:09] falls asleep\r\n" + 
				"[1518-04-23 00:11] falls asleep\r\n" + 
				"[1518-10-13 00:29] falls asleep\r\n" + 
				"[1518-10-11 23:56] Guard #113 begins shift\r\n" + 
				"[1518-03-16 00:49] falls asleep\r\n" + 
				"[1518-06-27 00:49] wakes up\r\n" + 
				"[1518-06-27 00:52] falls asleep\r\n" + 
				"[1518-03-19 00:50] wakes up\r\n" + 
				"[1518-10-11 00:32] falls asleep\r\n" + 
				"[1518-10-21 23:57] Guard #2293 begins shift\r\n" + 
				"[1518-03-02 00:00] Guard #1993 begins shift\r\n" + 
				"[1518-11-22 00:45] wakes up\r\n" + 
				"[1518-11-12 00:56] wakes up\r\n" + 
				"[1518-07-20 00:35] falls asleep\r\n" + 
				"[1518-11-16 00:36] falls asleep\r\n" + 
				"[1518-09-28 00:39] falls asleep\r\n" + 
				"[1518-08-16 23:59] Guard #3323 begins shift\r\n" + 
				"[1518-03-30 00:08] wakes up\r\n" + 
				"[1518-02-10 00:47] falls asleep\r\n" + 
				"[1518-10-24 23:56] Guard #1637 begins shift\r\n" + 
				"[1518-11-03 00:44] wakes up\r\n" + 
				"[1518-08-20 00:52] wakes up\r\n" + 
				"[1518-10-12 00:56] wakes up\r\n" + 
				"[1518-10-25 00:34] falls asleep\r\n" + 
				"[1518-09-12 00:00] Guard #3323 begins shift\r\n" + 
				"[1518-10-02 00:15] falls asleep\r\n" + 
				"[1518-05-11 00:12] falls asleep\r\n" + 
				"[1518-03-20 00:53] wakes up\r\n" + 
				"[1518-08-11 00:59] wakes up\r\n" + 
				"[1518-09-06 00:57] wakes up\r\n" + 
				"[1518-04-06 00:45] wakes up\r\n" + 
				"[1518-04-03 00:38] wakes up\r\n" + 
				"[1518-04-29 00:50] falls asleep\r\n" + 
				"[1518-06-15 00:58] wakes up\r\n" + 
				"[1518-02-25 00:04] Guard #811 begins shift\r\n" + 
				"[1518-11-04 23:59] Guard #2161 begins shift\r\n" + 
				"[1518-10-23 00:50] wakes up\r\n" + 
				"[1518-08-11 00:53] wakes up\r\n" + 
				"[1518-02-13 00:53] wakes up\r\n" + 
				"[1518-07-03 00:47] wakes up\r\n" + 
				"[1518-10-24 00:46] wakes up\r\n" + 
				"[1518-05-12 00:52] wakes up\r\n" + 
				"[1518-03-27 23:57] Guard #1327 begins shift\r\n" + 
				"[1518-07-19 00:33] wakes up\r\n" + 
				"[1518-10-14 00:01] falls asleep\r\n" + 
				"[1518-10-15 00:54] wakes up\r\n" + 
				"[1518-05-19 00:50] wakes up\r\n" + 
				"[1518-04-10 23:53] Guard #1327 begins shift\r\n" + 
				"[1518-10-23 00:48] falls asleep\r\n" + 
				"[1518-06-27 00:27] wakes up\r\n" + 
				"[1518-03-28 00:19] falls asleep\r\n" + 
				"[1518-10-02 23:48] Guard #811 begins shift\r\n" + 
				"[1518-03-04 00:29] falls asleep\r\n" + 
				"[1518-10-04 00:32] falls asleep\r\n" + 
				"[1518-04-10 00:43] falls asleep\r\n" + 
				"[1518-07-22 00:38] wakes up\r\n" + 
				"[1518-04-30 00:47] wakes up\r\n" + 
				"[1518-10-02 00:00] Guard #2161 begins shift\r\n" + 
				"[1518-02-18 23:53] Guard #2749 begins shift\r\n" + 
				"[1518-09-24 00:43] wakes up\r\n" + 
				"[1518-02-14 00:19] falls asleep\r\n" + 
				"[1518-05-26 00:51] wakes up\r\n" + 
				"[1518-06-29 00:23] wakes up\r\n" + 
				"[1518-06-29 00:28] falls asleep\r\n" + 
				"[1518-04-21 00:22] falls asleep\r\n" + 
				"[1518-08-10 00:23] falls asleep\r\n" + 
				"[1518-03-22 23:59] Guard #3137 begins shift\r\n" + 
				"[1518-06-02 00:58] wakes up\r\n" + 
				"[1518-06-21 00:45] falls asleep\r\n" + 
				"[1518-06-19 00:16] falls asleep\r\n" + 
				"[1518-09-29 00:55] wakes up\r\n" + 
				"[1518-04-29 00:46] wakes up\r\n" + 
				"[1518-07-05 00:42] falls asleep\r\n" + 
				"[1518-09-05 00:57] wakes up\r\n" + 
				"[1518-04-30 00:29] wakes up\r\n" + 
				"[1518-07-25 00:45] falls asleep\r\n" + 
				"[1518-02-23 00:41] falls asleep\r\n" + 
				"[1518-07-02 00:24] falls asleep\r\n" + 
				"[1518-08-17 23:56] Guard #1093 begins shift\r\n" + 
				"[1518-06-23 00:19] falls asleep\r\n" + 
				"[1518-10-18 23:59] Guard #229 begins shift\r\n" + 
				"[1518-08-25 00:05] falls asleep\r\n" + 
				"[1518-10-21 00:22] falls asleep\r\n" + 
				"[1518-02-27 23:57] Guard #113 begins shift\r\n" + 
				"[1518-08-02 23:53] Guard #3323 begins shift\r\n" + 
				"[1518-07-15 00:42] wakes up\r\n" + 
				"[1518-08-09 00:17] falls asleep\r\n" + 
				"[1518-04-04 00:59] wakes up\r\n" + 
				"[1518-09-10 00:56] wakes up\r\n" + 
				"[1518-08-08 00:42] wakes up\r\n" + 
				"[1518-06-10 00:03] Guard #1327 begins shift\r\n" + 
				"[1518-10-12 00:53] falls asleep\r\n" + 
				"[1518-11-04 00:34] falls asleep\r\n" + 
				"[1518-03-24 00:04] Guard #229 begins shift\r\n" + 
				"[1518-10-13 23:47] Guard #1993 begins shift\r\n" + 
				"[1518-10-31 00:01] Guard #2713 begins shift\r\n" + 
				"[1518-02-13 00:02] Guard #1613 begins shift\r\n" + 
				"[1518-05-21 00:11] falls asleep\r\n" + 
				"[1518-11-11 00:01] falls asleep\r\n" + 
				"[1518-04-24 00:33] falls asleep\r\n" + 
				"[1518-05-12 00:43] falls asleep\r\n" + 
				"[1518-03-03 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-04-20 00:01] Guard #2713 begins shift\r\n" + 
				"[1518-03-07 00:01] Guard #2293 begins shift\r\n" + 
				"[1518-10-09 00:44] wakes up\r\n" + 
				"[1518-05-22 00:17] falls asleep\r\n" + 
				"[1518-06-06 00:57] wakes up\r\n" + 
				"[1518-04-29 00:30] wakes up\r\n" + 
				"[1518-05-25 00:17] falls asleep\r\n" + 
				"[1518-06-03 00:12] falls asleep\r\n" + 
				"[1518-09-03 00:01] falls asleep\r\n" + 
				"[1518-02-12 00:46] wakes up\r\n" + 
				"[1518-02-27 00:22] falls asleep\r\n" + 
				"[1518-04-24 00:04] falls asleep\r\n" + 
				"[1518-06-21 00:08] falls asleep\r\n" + 
				"[1518-06-13 23:58] Guard #2399 begins shift\r\n" + 
				"[1518-06-07 00:25] falls asleep\r\n" + 
				"[1518-08-19 00:20] falls asleep\r\n" + 
				"[1518-04-02 00:03] Guard #2161 begins shift\r\n" + 
				"[1518-07-30 00:51] wakes up\r\n" + 
				"[1518-05-08 00:34] falls asleep\r\n" + 
				"[1518-06-13 00:10] falls asleep\r\n" + 
				"[1518-08-08 00:01] Guard #311 begins shift\r\n" + 
				"[1518-03-18 00:15] falls asleep\r\n" + 
				"[1518-05-19 00:21] falls asleep\r\n" + 
				"[1518-09-14 23:49] Guard #811 begins shift\r\n" + 
				"[1518-10-29 00:55] wakes up\r\n" + 
				"[1518-04-03 00:04] falls asleep\r\n" + 
				"[1518-11-02 23:56] Guard #811 begins shift\r\n" + 
				"[1518-08-30 23:59] Guard #3491 begins shift\r\n" + 
				"[1518-02-14 00:16] wakes up\r\n" + 
				"[1518-03-06 00:50] falls asleep\r\n" + 
				"[1518-08-28 23:57] Guard #3137 begins shift\r\n" + 
				"[1518-10-20 00:01] Guard #1709 begins shift\r\n" + 
				"[1518-11-03 00:36] falls asleep\r\n" + 
				"[1518-11-02 00:49] wakes up\r\n" + 
				"[1518-07-31 00:18] wakes up\r\n" + 
				"[1518-11-10 00:58] wakes up\r\n" + 
				"[1518-07-20 00:47] falls asleep\r\n" + 
				"[1518-09-25 00:22] wakes up\r\n" + 
				"[1518-09-14 00:55] wakes up\r\n" + 
				"[1518-03-01 00:55] wakes up\r\n" + 
				"[1518-07-22 00:02] Guard #1093 begins shift\r\n" + 
				"[1518-11-02 00:45] wakes up\r\n" + 
				"[1518-09-14 00:22] falls asleep\r\n" + 
				"[1518-06-24 00:04] falls asleep\r\n" + 
				"[1518-08-27 23:59] Guard #2713 begins shift\r\n" + 
				"[1518-03-10 00:46] wakes up\r\n" + 
				"[1518-09-09 00:36] wakes up\r\n" + 
				"[1518-06-25 00:58] wakes up\r\n" + 
				"[1518-07-02 00:57] falls asleep\r\n" + 
				"[1518-03-18 00:03] Guard #1637 begins shift\r\n" + 
				"[1518-07-23 00:04] falls asleep\r\n" + 
				"[1518-10-28 00:33] wakes up\r\n" + 
				"[1518-02-18 00:04] falls asleep\r\n" + 
				"[1518-05-24 00:07] falls asleep\r\n" + 
				"[1518-05-13 00:01] Guard #2713 begins shift\r\n" + 
				"[1518-02-16 00:07] falls asleep\r\n" + 
				"[1518-05-01 00:38] falls asleep\r\n" + 
				"[1518-06-22 00:59] wakes up\r\n" + 
				"[1518-06-18 00:27] wakes up\r\n" + 
				"[1518-07-18 00:49] falls asleep\r\n" + 
				"[1518-06-16 00:23] falls asleep\r\n" + 
				"[1518-07-06 00:31] falls asleep\r\n" + 
				"[1518-08-12 00:53] falls asleep\r\n" + 
				"[1518-02-23 23:50] Guard #3137 begins shift\r\n" + 
				"[1518-03-07 23:57] Guard #1613 begins shift\r\n" + 
				"[1518-04-06 23:58] Guard #1483 begins shift\r\n" + 
				"[1518-11-17 00:16] wakes up\r\n" + 
				"[1518-06-28 00:22] falls asleep\r\n" + 
				"[1518-08-23 00:07] falls asleep\r\n" + 
				"[1518-04-01 00:54] wakes up\r\n" + 
				"[1518-03-22 00:07] falls asleep\r\n" + 
				"[1518-07-21 00:47] wakes up\r\n" + 
				"[1518-08-23 00:58] wakes up\r\n" + 
				"[1518-06-30 00:03] Guard #2713 begins shift\r\n" + 
				"[1518-02-26 00:00] Guard #2383 begins shift\r\n" + 
				"[1518-04-03 00:23] falls asleep\r\n" + 
				"[1518-08-15 23:54] Guard #1613 begins shift\r\n" + 
				"[1518-03-17 00:00] falls asleep\r\n" + 
				"[1518-09-13 00:28] wakes up\r\n" + 
				"[1518-07-24 00:13] falls asleep\r\n" + 
				"[1518-02-28 00:58] wakes up\r\n" + 
				"[1518-06-14 00:54] wakes up\r\n" + 
				"[1518-08-17 00:20] falls asleep\r\n" + 
				"[1518-10-03 00:01] falls asleep\r\n" + 
				"[1518-10-23 00:02] Guard #3547 begins shift\r\n" + 
				"[1518-08-26 00:17] falls asleep\r\n" + 
				"[1518-04-30 00:04] falls asleep\r\n" + 
				"[1518-03-30 00:12] falls asleep\r\n" + 
				"[1518-09-02 00:57] wakes up\r\n" + 
				"[1518-08-09 00:03] Guard #1637 begins shift\r\n" + 
				"[1518-08-26 23:56] Guard #3137 begins shift\r\n" + 
				"[1518-04-18 00:23] falls asleep\r\n" + 
				"[1518-07-06 00:22] falls asleep\r\n" + 
				"[1518-05-19 00:00] Guard #3491 begins shift\r\n" + 
				"[1518-05-30 00:11] falls asleep\r\n" + 
				"[1518-04-16 00:59] wakes up\r\n" + 
				"[1518-04-02 00:38] falls asleep\r\n" + 
				"[1518-05-21 00:40] wakes up\r\n" + 
				"[1518-06-29 00:11] falls asleep\r\n" + 
				"[1518-10-07 00:51] wakes up\r\n" + 
				"[1518-11-02 00:12] falls asleep\r\n" + 
				"[1518-06-23 00:02] Guard #3137 begins shift\r\n" + 
				"[1518-06-29 00:51] wakes up\r\n" + 
				"[1518-08-10 00:31] wakes up\r\n" + 
				"[1518-06-13 00:50] falls asleep\r\n" + 
				"[1518-08-22 00:53] wakes up\r\n" + 
				"[1518-06-29 00:00] Guard #811 begins shift\r\n" + 
				"[1518-02-15 23:56] Guard #1993 begins shift\r\n" + 
				"[1518-04-20 00:59] wakes up\r\n" + 
				"[1518-05-03 00:59] wakes up\r\n" + 
				"[1518-09-02 00:02] Guard #311 begins shift\r\n" + 
				"[1518-05-02 00:57] wakes up\r\n" + 
				"[1518-07-16 00:01] Guard #1709 begins shift\r\n" + 
				"[1518-06-01 00:03] falls asleep\r\n" + 
				"[1518-06-10 00:25] wakes up\r\n" + 
				"[1518-09-01 00:46] wakes up\r\n" + 
				"[1518-04-19 00:37] falls asleep\r\n" + 
				"[1518-11-20 23:47] Guard #1993 begins shift\r\n" + 
				"[1518-07-19 00:25] falls asleep\r\n" + 
				"[1518-09-05 00:00] Guard #2399 begins shift\r\n" + 
				"[1518-02-17 00:04] Guard #3323 begins shift\r\n" + 
				"[1518-04-17 00:14] falls asleep\r\n" + 
				"[1518-07-29 00:09] falls asleep\r\n" + 
				"[1518-11-19 00:04] Guard #229 begins shift\r\n" + 
				"[1518-10-07 00:00] Guard #1993 begins shift\r\n" + 
				"[1518-09-24 00:04] Guard #3491 begins shift\r\n" + 
				"[1518-11-07 00:48] wakes up\r\n" + 
				"[1518-07-29 00:49] wakes up\r\n" + 
				"[1518-04-18 00:28] wakes up\r\n" + 
				"[1518-08-04 00:20] falls asleep\r\n" + 
				"[1518-08-04 00:47] wakes up\r\n" + 
				"[1518-08-31 00:09] falls asleep\r\n" + 
				"[1518-05-26 00:03] falls asleep\r\n" + 
				"[1518-03-03 00:57] falls asleep\r\n" + 
				"[1518-04-27 00:47] falls asleep\r\n" + 
				"[1518-05-28 00:40] wakes up\r\n" + 
				"[1518-05-23 00:00] Guard #1559 begins shift\r\n" + 
				"[1518-07-15 00:58] wakes up\r\n" + 
				"[1518-06-10 00:47] falls asleep\r\n" + 
				"[1518-09-14 00:44] falls asleep\r\n" + 
				"[1518-11-10 00:35] falls asleep\r\n" + 
				"[1518-04-02 00:59] wakes up\r\n" + 
				"[1518-10-09 00:59] wakes up\r\n" + 
				"[1518-09-26 23:57] Guard #113 begins shift\r\n" + 
				"[1518-05-05 00:36] wakes up\r\n" + 
				"[1518-09-20 00:26] falls asleep\r\n" + 
				"[1518-08-19 00:40] falls asleep\r\n" + 
				"[1518-10-24 00:07] falls asleep\r\n" + 
				"[1518-07-28 23:58] Guard #1613 begins shift\r\n" + 
				"[1518-06-16 00:00] Guard #113 begins shift\r\n" + 
				"[1518-11-23 00:59] wakes up\r\n" + 
				"[1518-08-20 00:36] falls asleep\r\n" + 
				"[1518-11-16 00:38] wakes up\r\n" + 
				"[1518-06-27 00:56] wakes up\r\n" + 
				"[1518-10-25 00:46] wakes up\r\n" + 
				"[1518-07-18 00:00] Guard #2749 begins shift\r\n" + 
				"[1518-07-12 00:50] wakes up\r\n" + 
				"[1518-10-30 00:10] falls asleep\r\n" + 
				"[1518-08-07 00:44] wakes up\r\n" + 
				"[1518-07-02 00:38] falls asleep\r\n" + 
				"[1518-10-20 00:57] wakes up\r\n" + 
				"[1518-03-12 00:34] wakes up\r\n" + 
				"[1518-03-05 00:04] Guard #2749 begins shift\r\n" + 
				"[1518-11-06 00:23] falls asleep\r\n" + 
				"[1518-06-25 00:29] falls asleep\r\n" + 
				"[1518-06-26 00:58] wakes up\r\n" + 
				"[1518-07-14 00:59] wakes up\r\n" + 
				"[1518-07-16 00:44] wakes up\r\n" + 
				"[1518-11-13 00:58] wakes up\r\n" + 
				"[1518-09-10 00:00] Guard #3323 begins shift\r\n" + 
				"[1518-03-20 00:46] wakes up\r\n" + 
				"[1518-06-05 23:56] Guard #3491 begins shift\r\n" + 
				"[1518-06-30 00:43] wakes up\r\n" + 
				"[1518-06-30 23:57] Guard #2399 begins shift\r\n" + 
				"[1518-07-03 00:00] Guard #1709 begins shift\r\n" + 
				"[1518-06-04 23:47] Guard #2749 begins shift\r\n" + 
				"[1518-07-14 00:56] falls asleep\r\n" + 
				"[1518-08-21 00:43] falls asleep\r\n" + 
				"[1518-04-29 00:38] falls asleep\r\n" + 
				"[1518-10-25 23:59] Guard #3491 begins shift\r\n" + 
				"[1518-09-24 00:14] falls asleep\r\n" + 
				"[1518-03-10 00:22] falls asleep\r\n" + 
				"[1518-10-10 00:44] wakes up\r\n" + 
				"[1518-05-17 00:58] wakes up\r\n" + 
				"[1518-04-02 00:42] wakes up\r\n" + 
				"[1518-02-28 23:58] Guard #229 begins shift\r\n" + 
				"[1518-08-04 00:57] wakes up\r\n" + 
				"[1518-08-25 00:17] wakes up\r\n" + 
				"[1518-04-28 00:34] falls asleep\r\n" + 
				"[1518-05-06 00:37] falls asleep\r\n" + 
				"[1518-08-22 23:56] Guard #811 begins shift\r\n" + 
				"[1518-08-10 00:49] wakes up\r\n" + 
				"[1518-05-01 23:48] Guard #2221 begins shift\r\n" + 
				"[1518-04-10 00:55] falls asleep\r\n" + 
				"[1518-10-06 00:01] falls asleep\r\n" + 
				"[1518-11-01 00:52] wakes up\r\n" + 
				"[1518-09-16 00:34] falls asleep\r\n" + 
				"[1518-11-16 00:58] wakes up\r\n" + 
				"[1518-11-07 00:02] Guard #113 begins shift\r\n" + 
				"[1518-03-02 00:43] wakes up\r\n" + 
				"[1518-05-18 00:02] Guard #2161 begins shift\r\n" + 
				"[1518-02-25 00:17] falls asleep\r\n" + 
				"[1518-03-12 23:57] Guard #1613 begins shift\r\n" + 
				"[1518-09-07 00:42] wakes up\r\n" + 
				"[1518-04-27 00:58] wakes up\r\n" + 
				"[1518-05-16 00:46] falls asleep\r\n" + 
				"[1518-05-22 00:59] wakes up\r\n" + 
				"[1518-10-13 00:01] falls asleep\r\n" + 
				"[1518-08-20 23:57] Guard #2221 begins shift\r\n" + 
				"[1518-05-14 00:44] falls asleep\r\n" + 
				"[1518-10-13 00:25] wakes up\r\n" + 
				"[1518-09-02 00:52] falls asleep\r\n" + 
				"[1518-03-20 00:00] falls asleep\r\n" + 
				"[1518-07-04 00:19] wakes up\r\n" + 
				"[1518-04-14 00:33] wakes up\r\n" + 
				"[1518-07-12 00:07] falls asleep\r\n" + 
				"[1518-10-07 00:37] falls asleep\r\n" + 
				"[1518-10-18 00:58] wakes up\r\n" + 
				"[1518-05-17 00:14] falls asleep\r\n" + 
				"[1518-10-05 23:49] Guard #2221 begins shift\r\n" + 
				"[1518-04-28 00:56] falls asleep\r\n" + 
				"[1518-09-09 00:00] Guard #1327 begins shift\r\n" + 
				"[1518-06-21 00:18] falls asleep\r\n" + 
				"[1518-06-28 00:00] Guard #2749 begins shift\r\n" + 
				"[1518-10-30 00:00] Guard #1613 begins shift\r\n" + 
				"[1518-06-05 00:52] wakes up\r\n" + 
				"[1518-09-28 00:55] wakes up\r\n" + 
				"[1518-05-06 00:03] Guard #2713 begins shift\r\n" + 
				"[1518-03-19 00:31] falls asleep\r\n" + 
				"[1518-06-24 00:57] wakes up\r\n" + 
				"[1518-09-11 00:40] wakes up\r\n" + 
				"[1518-02-21 23:58] Guard #2293 begins shift\r\n" + 
				"[1518-08-07 00:36] falls asleep\r\n" + 
				"[1518-03-09 00:04] Guard #229 begins shift\r\n" + 
				"[1518-09-30 00:22] falls asleep\r\n" + 
				"[1518-05-19 00:43] wakes up\r\n" + 
				"[1518-07-13 00:03] Guard #1709 begins shift\r\n" + 
				"[1518-02-10 23:58] Guard #1637 begins shift\r\n" + 
				"[1518-08-07 00:02] Guard #229 begins shift\r\n" + 
				"[1518-10-05 00:54] wakes up\r\n" + 
				"[1518-07-16 00:39] falls asleep\r\n" + 
				"[1518-07-16 23:58] Guard #2713 begins shift\r\n" + 
				"[1518-05-08 00:10] wakes up\r\n" + 
				"[1518-09-18 00:02] Guard #2713 begins shift\r\n" + 
				"[1518-05-02 23:58] Guard #1327 begins shift\r\n" + 
				"[1518-06-18 00:53] wakes up\r\n" + 
				"[1518-03-04 00:01] Guard #311 begins shift\r\n" + 
				"[1518-11-04 00:42] wakes up\r\n" + 
				"[1518-10-09 00:39] falls asleep\r\n" + 
				"[1518-10-16 00:24] falls asleep\r\n" + 
				"[1518-09-17 00:16] falls asleep\r\n" + 
				"[1518-05-25 00:51] wakes up\r\n" + 
				"[1518-03-30 00:59] wakes up\r\n" + 
				"[1518-11-21 00:00] falls asleep\r\n" + 
				"[1518-05-22 00:30] wakes up\r\n" + 
				"[1518-04-01 00:43] falls asleep\r\n" + 
				"[1518-10-03 00:44] wakes up\r\n" + 
				"[1518-02-25 00:58] wakes up\r\n" + 
				"[1518-11-05 00:25] wakes up\r\n" + 
				"[1518-09-24 23:59] Guard #2221 begins shift\r\n" + 
				"[1518-04-17 00:18] wakes up\r\n" + 
				"[1518-03-19 00:55] wakes up\r\n" + 
				"[1518-05-04 23:50] Guard #3547 begins shift";
		
		// PART 1
		int[][] timeLog = organize(puzzleInput);
		int guard = getSleepiestGuard(timeLog);
		int minute = getSleepiestMinute(guard, timeLog);
		System.out.printf("Sleepiest guard: %d\nSleepiest minute: %d\nMultiplied: %d\n", guard, minute, guard * minute);

		// PART 2
		int result = getSleepiest(addSleepiestMinutes(getGuards(timeLog), timeLog));
		System.out.printf("Multipled (strategy 2): %d", result);
		
	}
	
	public static void print(int[][] input) {
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int[][] organize(String input) {
		
		String[] splitInput = input.split("\r\n");
		int[][] result = new int[splitInput.length][3];
		
		for (int i = 0; i < splitInput.length; i++) {
			
			String temp = splitInput[i];
			
			// store time
			String tempTime = temp.substring(6,8) + temp.substring(9,11) + temp.substring(12,14) + temp.substring(15,17);
			result[i][0] = Integer.parseInt(tempTime);
			
			// store guard number and awake/asleep status
			int hashIndex = temp.indexOf("#");
			if (hashIndex != -1) {
				int begin = hashIndex + 1;
				int end = begin + temp.substring(hashIndex + 1).indexOf(" ");
				String tempNum = temp.substring(begin, end);
				result[i][1] = Integer.parseInt(tempNum);
				// set to awake
				result[i][2] = 0;
			}
			else if (temp.charAt(19) == 'w') {
				result[i][2] = 0;
			}
			else {
				// set to asleep
				result[i][2] = 1;
			}
			
		}
		
		// sort chronologically
		java.util.Arrays.sort(result, java.util.Comparator.comparingInt(a -> a[0]));
		
		for (int i = 0; i < result.length; i++) {
			// trim time to only minutes
			result[i][0] = result[i][0] % 100;
			// finish adding all guard IDs
			if (result[i][1] == 0) {
				result[i][1] = result[i - 1][1];
			}
		}
		
		return result;
		
	}
	
	// PART 1
	public static int getSleepiestGuard(int[][] input) {
		
		// create array of guards and their total asleep times
		int[][] asleepTime = new int[input.length][2];
		int currentSize = 0;
		
		for (int i = 0; i < input.length; i++) {
			// create an array of unique guard ids
			boolean isNew = true;
			int guardPos = 0;
			for (int j = 0; j < currentSize; j++) {
				if (input[i][1] == asleepTime[j][0]) {
					isNew = false;
					guardPos = j;
				}
			}
			if (isNew) {
				asleepTime[currentSize][0] = input[i][1];
				guardPos = currentSize;
				currentSize++;
			}
			
			// add each set of asleep minutes to each guard
			if (input[i][2] == 1) {
				for (int k = input[i][0]; k < input[i + 1][0]; k++) {
					asleepTime[guardPos][1]++;
				}
			}
		}
		
		// trim array
		asleepTime = java.util.Arrays.copyOf(asleepTime, currentSize);
		// print(asleepTime);
		
		// return most sleepy guard
		int sleepiestIndex = 0;
		for (int i = 1; i < asleepTime.length; i++) {
			if (asleepTime[sleepiestIndex][1] < asleepTime[i][1]) {
				sleepiestIndex = i;
			}
		}
		return asleepTime[sleepiestIndex][0];
	
	}
	
	public static int getSleepiestMinute(int id, int[][] input) {
		
		// create an array of minutes from midnight
		int[][] asleepMinutes = new int[60][2];
		for (int i = 0; i < asleepMinutes.length; i++) {
			asleepMinutes[i][0] = i;
		}
		
		// add times asleep at that minute
		for (int i = 0; i < input.length; i++) {
			if (input[i][1] == id && input[i][2] == 1) {
				for (int k = input[i][0]; k < input[i + 1][0]; k++) {
					asleepMinutes[k][1]++;
				}
			}
		}
		
		// print(asleepMinutes);
		
		// return sleepiest minute
		int sleepiestIndex = 0;
		for (int i = 1; i < asleepMinutes.length; i++) {
			if (asleepMinutes[sleepiestIndex][1] < asleepMinutes[i][1]) {
				sleepiestIndex = i;
			}
		}
		
		return asleepMinutes[sleepiestIndex][0];
		
	}
	
	// PART 2
	public static int[] getGuards(int[][] input) {
		
		// create an array of unique guard ids
		int[] guardIds = new int[input.length];
		int currentSize = 0;
		
		for (int i = 0; i < input.length; i++) {
			boolean isNew = true;
			for (int j = 0; j < currentSize; j++) {
				if (input[i][1] == guardIds[j]) {
					isNew = false;
				}
			}
			if (isNew) {
				guardIds[currentSize] = input[i][1];
				currentSize++;
			}
		}
		
		// trim array
		guardIds = java.util.Arrays.copyOf(guardIds, currentSize);
		return guardIds;
	}
	
	public static int[][] addSleepiestMinutes(int[] guards, int[][] input) {
		
		// create an array of guards with their sleepiest minutes
		int[][] mostSleepy = new int[guards.length][3];
		for (int i = 0; i < guards.length; i++) {
			mostSleepy[i][0] = guards[i];
		}
		
		// repeat for every guard
		for (int g = 0; g < guards.length; g++) {
			
			int id = mostSleepy[g][0];
			
			// create an array of minutes from midnight
			int[][] asleepMinutes = new int[60][2];
			for (int i = 0; i < asleepMinutes.length; i++) {
				asleepMinutes[i][0] = i;
			}
			
			// add times asleep at that minute
			for (int i = 0; i < input.length; i++) {
				if (input[i][1] == id && input[i][2] == 1) {
					for (int k = input[i][0]; k < input[i + 1][0]; k++) {
						asleepMinutes[k][1]++;
					}
				}
			}
			
			// add sleepiest minute and number of times asleep at that minute
			int sleepiestIndex = 0;
			for (int i = 1; i < asleepMinutes.length; i++) {
				if (asleepMinutes[sleepiestIndex][1] < asleepMinutes[i][1]) {
					sleepiestIndex = i;
				}
			}
			mostSleepy[g][1] = asleepMinutes[sleepiestIndex][0];
			mostSleepy[g][2] = asleepMinutes[sleepiestIndex][1];
			
		}
		
		return mostSleepy;
		
	}
	
	public static int getSleepiest(int[][] input) {
		
		int sleepiestIndex = 0;
		for (int i = 1; i < input.length; i++) {
			if (input[sleepiestIndex][2] < input[i][2]) {
				sleepiestIndex = i;
			}
		}
		
		int sleepiestGuard = input[sleepiestIndex][0];
		int sleepiestMinute = input[sleepiestIndex][1];
		
		return sleepiestGuard * sleepiestMinute;
		
	}

}