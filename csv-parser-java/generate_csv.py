import csv
import random

# Define headers for the CSV file
headers = [
    "PERIOD_ID", "GGRPHCL_REGION_ID", "DATA_ITEM_ID", "DIMENSION1_LKUP_ID", 
    "DIMENSION2_LKUP_ID", "DIMENSION3_LKUP_ID", "DIMENSION4_LKUP_ID", 
    "DIMENSION5_LKUP_ID", "POINT_ESTIMATE_SUPPLY", "POINT_ESTIMATE_DEMAND", 
    "GAP", "UNMET_DEMAND_LOW", "UNMET_DEMAND_GAP_LOW_COL", "UNMET_DEMAND_GAP_LOW", 
    "UNMET_DEMAND_HIGH", "UNMET_DEMAND_GAP_HIGH_COL", "UNMET_DEMAND_GAP_HIGH", 
    "ASSMPTN_VALUE", "ASSMPTN_VALUE_PCT"
]

# Create random data for CSV rows
def generate_random_data(row_count):
    data = []
    for i in range(row_count):
        period_id = f"2025-Q{random.randint(1, 4)}"
        region_id = f"R{random.randint(1, 10)}"
        data_item_id = random.randint(100, 200)
        dimensions = [f"DIM{random.randint(1, 5)}" for _ in range(5)]
        point_estimate_supply = round(random.uniform(1000, 5000), 2)
        point_estimate_demand = round(random.uniform(800, 4800), 2)
        gap = round(point_estimate_supply - point_estimate_demand, 2)
        unmet_demand_low = round(random.uniform(10, 50), 2)
        unmet_demand_gap_low_col = round(random.uniform(5, 30), 2)
        unmet_demand_gap_low = round(random.uniform(10, 60), 2)
        unmet_demand_high = round(random.uniform(100, 200), 2)
        unmet_demand_gap_high_col = round(random.uniform(5, 30), 2)
        unmet_demand_gap_high = round(random.uniform(80, 250), 2)
        assmptn_value = round(random.uniform(50, 200), 2)
        assmptn_value_pct = round(random.uniform(0.1, 5.0), 2)
        
        row = [period_id, region_id, data_item_id] + dimensions + [
            point_estimate_supply, point_estimate_demand, gap, unmet_demand_low, 
            unmet_demand_gap_low_col, unmet_demand_gap_low, unmet_demand_high, 
            unmet_demand_gap_high_col, unmet_demand_gap_high, assmptn_value, assmptn_value_pct
        ]
        data.append(row)
    return data

# Write data to CSV file
def write_to_csv(file_name, row_count):
    with open(file_name, mode="w", newline='') as file:
        writer = csv.writer(file)
        writer.writerow(headers)  # Write headers
        rows = generate_random_data(row_count)
        writer.writerows(rows)  # Write rows of random data

# Generate a CSV file with 100000 rows
write_to_csv("sample_1000000.csv", 1000000)

print("CSV file with 100000 rows has been generated: 'sample_1000000.csv'")