def findMatrix(nums):
    """
    Find unique rows in a matrix.

    Args:
        nums (List[List[int]]): The input matrix.

    Returns:
        List[List[int]]: A list of unique rows in the matrix.
    """
    ans = []  # Initialize an empty list to store unique rows
    s = set()  # Initialize an empty set to keep track of seen rows

    while nums:  # Continue the loop until all rows are processed
        uniqueRow = []  # Initialize an empty list to store a unique row
        i = 0  # Initialize the index counter

        while i < len(nums):  # Iterate through each row in the matrix
            if nums[i] not in s:  # Check if the row is not seen before
                s.add(nums[i])  # Add the row to the set of seen rows
                uniqueRow = nums[i]  # Assign the current row as the unique row
                break  # Exit the inner loop since a unique row is found

            i += 1  # Increment the index counter to move to the next row

        ans.append(uniqueRow)  # Add the unique row to the list of unique rows

    return ans  # Return the list of unique rows
def findMatrix(nums):
    """
    Find unique rows in a matrix.

    Args:
        nums (List[List[int]]): The input matrix.

    Returns:
        List[List[int]]: A list of unique rows in the matrix.
    """
    ans = []  # Initialize an empty list to store the unique rows
    s = set()  # Initialize an empty set to keep track of seen rows

    while nums:  # Continue until there are no more rows in the matrix
        uniqueRow = []  # Initialize an empty list to store the unique row elements
        i = 0  # Initialize the index to iterate through the rows
        while i < len(nums):  # Iterate through the remaining rows
            if nums[i] not in s:  # Check if the row is not seen before
                s.add(nums[i])  # Add the row to the set of seen rows
                uniqueRow.append(nums[i])  # Append the row to the uniqueRow list
                nums.pop(i)  # Remove the row from the matrix
                i -= 1  # Adjust the index after popping an element
            i += 1  # Move to the next row

        ans.append(uniqueRow)  # Append the uniqueRow list to the ans list
        s.clear()  # Clear the set for the next row

    return ans  # Return the list of unique rows
