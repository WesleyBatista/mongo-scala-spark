Nothing pretentious. It's just a repository used to learn Scala :)



## Mongo Setup

```
docker run --name mongo -p=27017:27017 -d mongo

wget http://files.grouplens.org/datasets/movielens/ml-100k.zip

unzip ml-100k.zip

docker cp ml-100k/u.data mongo:/tmp/

docker exec -it mongo sh -c "mongoimport -d movies -c movie_ratings --type tsv --file /tmp/u.data --fields user_id,movie_id,rating,timestamp"
```


## SBT

```
sbt

sparkSubmit --master local[*] --class example.MovieRecommendation --
```

## Resources
- [saurfang/sbt-spark-submit](https://github.com/saurfang/sbt-spark-submit)
- [Using MongoDB Connector for Spark](http://cdn2.hubspot.net/hubfs/438089/notebooks/MongoDB_guest_blog/Using_MongoDB_Connector_for_Spark.html)
- [MovieRecommendation.scala](https://github.com/samweaver/mongodb-spark/blob/e03ffb8752bbad43d2c3ef97fb8a4f6c6bc663ab/movie-recommendations/src/main/scala/example/MovieRecommendation.scala)