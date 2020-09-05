import pandas as pd

mydateparser = lambda x: pd.datetime.strptime(x, "%Y-%m-%d %H:%M:%S")
df = pd.read_csv('../ParkingLotData.csv', parse_dates=['time'], date_parser=mydateparser)

df.sort_values('number')

df['parkingTime'] = df['time'].shift(-1) - df['time']
df['parkingTime'] = pd.to_timedelta(df['parkingTime'])

FilteredDf = df[df.logType == 'Entry']
FilteredDf = FilteredDf.drop(['logType', 'vehicleType'], axis=1)

print(FilteredDf)

print(FilteredDf.groupby(['number']).sum())
