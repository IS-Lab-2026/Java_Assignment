# Rental Cost Calculator

A Java console application designed to calculate total rental costs based on specific time-based hourly rates and time validation logic.

## Features

- **Input Validation**: Verifies that:
  - Start time is between `0` and `23`
  - End time is between `1` and `24`
  - Start time occurs before end time
- **Tiered Hourly Pricing**: Automatically calculates costs using time-of-day rates (in RWF):
  - **00:00 - 07:00**: 500 RWF / hour
  - **07:00 - 14:00**: 1,000 RWF / hour
  - **14:00 - 19:00**: 1,500 RWF / hour
  - **19:00 - 21:00**: 1,000 RWF / hour
  - **21:00 - 24:00**: 500 RWF / hour

 ## Example Run


Enter startind time (0-23): 6
Enter ending time(1-24): 15
Total rental cost =9000RWF

