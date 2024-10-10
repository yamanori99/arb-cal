# Here, we measure the degree of arbitrariness of conventions
# A function to calculate entropy
entropy <- function(probabilities) {
  # Calculate the information content I(x_i)
  information_content <- -log2(probabilities)
  
  # Calculate the entropy H(x)
  entropy_value <- sum(probabilities * information_content)
  return(entropy_value)
}

# Probabilities of each convention, basin of attraction
# Below is an input example, with the basin of attraction from the author's simulation.
probabilities <- c(0.113709, 0.33434, 0.185575, 0.166355, 0.200022)
entropy_value <- entropy(probabilities)
print(entropy_value)
