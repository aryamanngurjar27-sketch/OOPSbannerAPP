# Helper function to print letter 'O'
def print_o():
    o_pattern = [
        " *** ",
        "*   *",
        "*   *",
        "*   *",
        " *** "
    ]
    return o_pattern

# Helper function to print letter 'P'
def print_p():
    p_pattern = [
        "**** ",
        "*   *",
        "**** ",
        "*    ",
        "*    "
    ]
    return p_pattern

# Helper function to print letter 'S'
def print_s():
    s_pattern = [
        " *** ",
        "*    ",
        " *** ",
        "    *",
        " *** "
    ]
    return s_pattern

# Function to render the letters in the final output
def render_banner():
    # Define the letters we want to print (in sequence)
    letters = [print_o(), print_p(), print_s()]
    
    # Loop to render each row of the characters
    for i in range(5):  # Each letter is 5 rows tall
        for letter in letters:
            print(letter[i], end="   ")  # Print each character in the row with spacing
        print()  # Newline after each row

# Run the program
render_banner()