
import math

# Function to calculate entropy
def entropy(probabilities):
    # Calculate the information content I(x_i)
    information_content = [-math.log2(p) for p in probabilities]
    
    # Calculate the entropy H(x)
    entropy_value = sum(p * i for p, i in zip(probabilities, information_content))
    return entropy_value

# Probabilities of each convention, basin of attraction
# Below is an input example, with the basin of attraction from the author's simulation.
probabilities = [0.113709, 0.33434, 0.185575, 0.166355, 0.200022]
entropy_value = entropy(probabilities)
print(entropy_value)
