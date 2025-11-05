# Array Operations Axioms

## Core Axioms for Array Operations

1. **Fixed Size**
    - Arrays have a fixed size once created
    - Memory is allocated contiguously
    - Size must be known at creation time

2. **Random Access**
    - Elements can be accessed directly using indices
    - Time complexity is O(1) for access
    - Index starts at 0 in most programming languages

3. **Memory Locality**
    - Elements are stored in consecutive memory locations
    - Enhances cache performance
    - Improves iteration speed

4. **Base Operations**
    - Reading: O(1)
    - Writing: O(1)
    - Insertion: O(n)
    - Deletion: O(n)
    - Search (unsorted): O(n)
    - Search (sorted): O(log n) with binary search

5. **Memory Requirements**
    - Size = number of elements * size of each element
    - Fixed overhead plus element storage
    - Contiguous memory block required

## Best Practices
- Check array bounds before access
- Consider capacity when adding elements
- Use appropriate data types for elements
- Handle edge cases (empty array, single element)