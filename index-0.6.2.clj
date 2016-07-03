{:namespaces
 ({:doc
   "A Clojure interface to SQL databases via JDBC\n\nclojure.java.jdbc provides a simple abstraction for CRUD (create, read,\nupdate, delete) operations on a SQL database, along with basic transaction\nsupport. Basic DDL operations are also supported (create table, drop table,\naccess to table metadata).\n\nMaps are used to represent records, making it easy to store and retrieve\ndata. Results can be processed using any standard sequence operations.\n\nFor most operations, Java's PreparedStatement is used so your SQL and\nparameters can be represented as simple vectors where the first element\nis the SQL string, with ? for each parameter, and the remaining elements\nare the parameter values to be substituted. In general, operations return\nthe number of rows affected, except for a single record insert where any\ngenerated keys are returned (as a map).\n\nFor more documentation, see:\n\nhttp://clojure-doc.org/articles/ecosystem/java_jdbc/home.html",
   :author "Stephen C. Gilardi, Sean Corfield",
   :name "clojure.java.jdbc",
   :wiki-url "http://clojure.github.io/java.jdbc/index.html",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj"}
  {:doc "Optional specifications for use with Clojure 1.9 or later.",
   :author "Sean Corfield",
   :name "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc/index.html#clojure.java.jdbc.spec",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/ab12a9dd77611700924aae67b99e2b8d7185ced0/src/main/clojure/clojure/java/jdbc/spec.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "as-sql-name",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L51",
   :line 51,
   :var-type "function",
   :arglists ([f] [f x]),
   :doc
   "Given a naming strategy function and a keyword or string, return\na string per that naming strategy.\nA name of the form x.y is treated as multiple names, x, y, etc,\nand each are turned into strings via the naming strategy and then\njoined back together so x.y might become `x`.`y` if the naming\nstrategy quotes identifiers with `.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/as-sql-name"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "create-table-ddl",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L1191",
   :line 1191,
   :var-type "function",
   :arglists ([table specs] [table specs opts]),
   :doc
   "Given a table name and a vector of column specs, return the DDL string for\ncreating that table. Each column spec is, in turn, a vector of keywords or\nstrings that is converted to strings and concatenated with spaces to form\na single column description in DDL, e.g.,\n  [:cost :int \"not null\"]\n  [:name \"varchar(32)\"]\nThe first element of a column spec is treated as a SQL entity (so if you\nprovide the :entities option, that will be used to transform it). The\nremaining elements are left as-is when converting them to strings.\nAn options map may be provided that can contain:\n:table-spec -- a string that is appended to the DDL -- and/or\n:entities -- a function to specify how column names are transformed.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/create-table-ddl"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-connection",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L555",
   :line 555,
   :var-type "function",
   :arglists ([db]),
   :doc
   "Returns the current database connection (or throws if there is none)",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-connection"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-do-commands",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L720",
   :line 720,
   :var-type "function",
   :arglists ([db sql-commands] [db transaction? sql-commands]),
   :doc
   "Executes SQL commands on the specified database connection. Wraps the commands\nin a transaction if transaction? is true. transaction? can be ommitted and it\ndefaults to true. Accepts a single SQL command (string) or a vector of them.\nUses executeBatch. This may affect what SQL you can run via db-do-commands.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-do-commands"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-do-prepared",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L811",
   :line 811,
   :var-type "function",
   :arglists
   ([db sql-params]
    [db transaction? sql-params]
    [db transaction? sql-params opts]),
   :doc
   "Executes an (optionally parameterized) SQL prepared statement on the\nopen database connection. Each param-group is a seq of values for all of\nthe parameters. transaction? can be omitted and defaults to true.\nThe sql parameter can either be a SQL string or a PreparedStatement.\nReturn a seq of update counts (one count for each param-group).",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-do-prepared"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-do-prepared-return-keys",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L770",
   :line 770,
   :var-type "function",
   :arglists
   ([db sql-params]
    [db transaction? sql-params]
    [db transaction? sql-params opts]),
   :doc
   "Executes an (optionally parameterized) SQL prepared statement on the\nopen database connection. The param-group is a seq of values for all of\nthe parameters. transaction? can be ommitted and will default to true.\nReturn the generated keys for the (single) update/insert.\nA PreparedStatement may be passed in, instead of a SQL string, in which\ncase :return-keys MUST BE SET on that PreparedStatement!",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-do-prepared-return-keys"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-find-connection",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L549",
   :line 549,
   :var-type "function",
   :arglists ([db]),
   :doc
   "Returns the current database connection (or nil if there is none)",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-find-connection"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-is-rollback-only",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L572",
   :line 572,
   :var-type "function",
   :arglists ([db]),
   :doc
   "Returns true if the outermost transaction will rollback rather than\ncommit when complete",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-is-rollback-only"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-query-with-resultset",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L835",
   :line 835,
   :var-type "function",
   :arglists ([db sql-params func] [db sql-params func opts]),
   :doc
   "Executes a query, then evaluates func passing in the raw ResultSet as an\n argument. The second argument is a vector containing either:\n  [sql & params] - a SQL query, followed by any parameters it needs\n  [stmt & params] - a PreparedStatement, followed by any parameters it needs\n                    (the PreparedStatement already contains the SQL query)\nThe opts map is passed to prepare-statement.\nUses executeQuery. This may affect what SQL you can run via query.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-query-with-resultset"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-set-rollback-only!",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L561",
   :line 561,
   :var-type "function",
   :arglists ([db]),
   :doc
   "Marks the outermost transaction such that it will rollback rather than\ncommit when complete",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-set-rollback-only!"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-transaction*",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L586",
   :line 586,
   :var-type "function",
   :arglists ([db func] [db func opts]),
   :doc
   "Evaluates func as a transaction on the open database connection. Any\nnested transactions are absorbed into the outermost transaction. By\ndefault, all database updates are committed together as a group after\nevaluating the outermost body, or rolled back on any uncaught\nexception. If rollback is set within scope of the outermost transaction,\nthe entire transaction will be rolled back rather than committed when\ncomplete.\nThe isolation option may be :none, :read-committed, :read-uncommitted,\n:repeatable-read, or :serializable. Note that not all databases support\nall of those isolation levels, and may either throw an exception or\nsubstitute another isolation level.\nThe read-only? option puts the transaction in readonly mode (if supported).",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-transaction*"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "db-unset-rollback-only!",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L567",
   :line 567,
   :var-type "function",
   :arglists ([db]),
   :doc
   "Marks the outermost transaction such that it will not rollback when complete",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/db-unset-rollback-only!"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "delete!",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L1011",
   :line 1011,
   :var-type "function",
   :arglists ([db table where-clause] [db table where-clause opts]),
   :doc
   "Given a database connection, a table name and a where clause of columns to match,\nperform a delete. The options may specify how to transform column names in the\nmap (default 'as-is') and whether to run the delete in a transaction (default true).\nExample:\n  (delete! db :person [\"zip = ?\" 94546])\nis equivalent to:\n  (execute! db [\"DELETE FROM person WHERE zip = ?\" 94546])",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/delete!"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "drop-table-ddl",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L1221",
   :line 1221,
   :var-type "function",
   :arglists
   ([name] [name {:keys [entities], :or {entities identity}}]),
   :doc
   "Given a table name, return the DDL string for dropping that table.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/drop-table-ddl"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "execute!",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L977",
   :line 977,
   :var-type "function",
   :arglists ([db sql-params] [db sql-params opts]),
   :doc
   "Given a database connection and a vector containing SQL (or PreparedStatement)\nfollowed by optional parameters, perform a general (non-select) SQL operation.\nThe :transaction? option specifies whether to run the operation in a\ntransaction or not (default true).\nIf the :multi? option is false (the default), the SQL statement should be\nfollowed by the parameters for that statement.\nIf the :multi? option is true, the SQL statement should be followed by one or\nmore vectors of parameters, one for each application of the SQL statement.\nIf there are no parameters specified, executeUpdate will be used, otherwise\nexecuteBatch will be used. This may affect what SQL you can run via execute!",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/execute!"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "find-by-keys",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L939",
   :line 939,
   :var-type "function",
   :arglists ([db table columns] [db table columns opts]),
   :doc
   "Given a database connection, a table name, a map of column name/value\npairs, and an optional options map, return any matching rows.\nAn :order-by option may be supplied to sort the rows by a sequence of\ncolumns, e.g,. {:order-by [:name {:age :desc]}",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/find-by-keys"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "get-by-id",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L961",
   :line 961,
   :var-type "function",
   :arglists
   ([db table pk-value]
    [db table pk-value pk-name-or-opts]
    [db table pk-value pk-name opts]),
   :doc
   "Given a database connection, a table name, a primary key value, an\noptional primary key column name, and an optional options map, return\na single matching row, or nil.\nThe primary key column name defaults to :id.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/get-by-id"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "get-connection",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L193",
   :line 193,
   :var-type "function",
   :arglists
   ([{:keys
      [connection
       factory
       connection-uri
       classname
       subprotocol
       subname
       dbtype
       dbname
       host
       port
       datasource
       username
       password
       user
       name
       environment],
      :as db-spec}]),
   :doc
   "Creates a connection to a database. db-spec is usually a map containing connection\nparameters but can also be a URI or a String. The various possibilities are described\nbelow:\n\nExisting Connection:\n  :connection  (required) an existing open connection that can be used\n               but cannot be closed (only the parent connection can be closed)\n\nFactory:\n  :factory     (required) a function of one argument, a map of params\n  (others)     (optional) passed to the factory function in a map\n\nDriverManager:\n  :subprotocol (required) a String, the jdbc subprotocol\n  :subname     (required) a String, the jdbc subname\n  :classname   (optional) a String, the jdbc driver class name\n  (others)     (optional) passed to the driver as properties.\n\nDriverManager (alternative):\n  :dbtype      (required) a String, the type of the database (the jdbc subprotocol)\n  :dbname      (required) a String, the name of the database\n  :host        (optional) a String, the host name/IP of the database\n                          (defaults to 127.0.0.1)\n  :port        (optional) a Long, the port of the database\n                          (defaults to 3306 for mysql, 1433 for mssql/jtds, else nil)\n  (others)     (optional) passed to the driver as properties.\n\nDataSource:\n  :datasource  (required) a javax.sql.DataSource\n  :username    (optional) a String\n  :user        (optional) a String - an alternate alias for :username\n                          (added after 0.3.0-beta2 for consistency JDBC-74)\n  :password    (optional) a String, required if :username is supplied\n\nJNDI:\n  :name        (required) a String or javax.naming.Name\n  :environment (optional) a java.util.Map\n\nRaw:\n  :connection-uri (required) a String\n               Passed directly to DriverManager/getConnection\n\nURI:\n  Parsed JDBC connection string - see below\n\nString:\n  subprotocol://user:password@host:post/subname\n               An optional prefix of jdbc: is allowed.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/get-connection"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "insert!",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L1115",
   :line 1115,
   :var-type "function",
   :arglists
   ([db table row]
    [db table cols-or-row values-or-opts]
    [db table cols values opts]),
   :doc
   "Given a database connection, a table name and either a map representing a rows,\nor a list of column names followed by a list of column values also representing\na single row, perform an insert.\nWhen inserting a row as a map, the result is the database-specific form of the\ngenerated keys, if available (note: PostgreSQL returns the whole row).\nWhen inserting a row as a list of column values, the result is the count of\nrows affected (1), if available (from getUpdateCount after executeBatch).\nThe row map or column value vector may be followed by a map of options:\nThe :transaction? option specifies whether to run in a transaction or not.\nThe default is true (use a transaction). The :entities option specifies how\nto convert the table name and column names to SQL entities.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/insert!"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "insert-multi!",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L1135",
   :line 1135,
   :var-type "function",
   :arglists
   ([db table rows]
    [db table cols-or-rows values-or-opts]
    [db table cols values opts]),
   :doc
   "Given a database connection, a table name and either a sequence of maps (for\nrows) or a sequence of column names, followed by a sequence of vectors (for\nthe values in each row), and possibly a map of options, insert that data into\nthe database.\nWhen inserting rows as a sequence of maps, the result is a sequence of the\ngenerated keys, if available (note: PostgreSQL returns the whole rows).\nWhen inserting rows as a sequence of lists of column values, the result is\na sequence of the counts of rows affected (a sequence of 1's), if available.\nYes, that is singularly unhelpful. Thank you getUpdateCount and executeBatch!\nThe :transaction? option specifies whether to run in a transaction or not.\nThe default is true (use a transaction). The :entities option specifies how\nto convert the table name and column names to SQL entities.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/insert-multi!"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "metadata-query",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L708",
   :line 708,
   :var-type "macro",
   :arglists ([meta-query & opt-args]),
   :doc
   "Given a Java expression that extracts metadata (in the context of with-db-metadata),\nand a map of options like metadata-result, manage the connection for a single\nmetadata-based query. Example usage:\n\n(with-db-metadata [meta db-spec]\n  (metadata-query (.getTables meta nil nil nil (into-array String [\"TABLE\"]))\n    {:row-fn ... :result-set-fn ...}))",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/metadata-query"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "metadata-result",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L687",
   :line 687,
   :var-type "function",
   :arglists
   ([rs-or-value]
    [rs-or-value
     {:keys [as-arrays? identifiers qualifier result-set-fn row-fn],
      :or {identifiers lower-case, row-fn identity}}]),
   :doc
   "If the argument is a java.sql.ResultSet, turn it into a result-set-seq,\nelse return it as-is. This makes working with metadata easier.\nAlso accepts an option map containing :identifiers, :qualifier, :as-arrays?,\n:row-fn,and :result-set-fn to control how the ResultSet is transformed and\nreturned. See query for more details.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/metadata-result"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "prepare-statement",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L455",
   :line 455,
   :var-type "function",
   :arglists
   ([con sql]
    [con
     sql
     {:keys
      [return-keys
       result-type
       concurrency
       cursors
       fetch-size
       max-rows
       timeout]}]),
   :doc
   "Create a prepared statement from a connection, a SQL string and a map\nof options:\n   :return-keys truthy | nil - default nil\n     for some drivers, this may be a vector of column names to identify\n     the generated keys to return, otherwise it should just be true\n   :result-type :forward-only | :scroll-insensitive | :scroll-sensitive\n   :concurrency :read-only | :updatable\n   :cursors\n   :fetch-size n\n   :max-rows n\n   :timeout n",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/prepare-statement"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "print-sql-exception",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L509",
   :line 509,
   :var-type "function",
   :arglists ([exception]),
   :doc "Prints the contents of an SQLException to *out*",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/print-sql-exception"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "print-sql-exception-chain",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L523",
   :line 523,
   :var-type "function",
   :arglists ([exception]),
   :doc "Prints a chain of SQLExceptions to *out*",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/print-sql-exception-chain"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "print-update-counts",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L535",
   :line 535,
   :var-type "function",
   :arglists ([exception]),
   :doc
   "Prints the update counts from a BatchUpdateException to *out*",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/print-update-counts"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "query",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L872",
   :line 872,
   :var-type "function",
   :arglists ([db sql-params] [db sql-params opts]),
   :doc
   "Given a database connection and a vector containing SQL and optional parameters,\nperform a simple database query. The options specify how to construct the result\nset (and are also passed to prepare-statement as needed):\n  :as-arrays? - return the results as a set of arrays, default false.\n  :identifiers - applied to each column name in the result set, default lower-case\n  :qualifier - optionally provides the namespace qualifier for identifiers\n  :result-set-fn - applied to the entire result set, default doall / vec\n      if :as-arrays? true, :result-set-fn will default to vec\n      if :as-arrays? false, :result-set-fn will default to doall\n  :row-fn - applied to each row as the result set is constructed, default identity\nThe second argument is a vector containing a SQL string or PreparedStatement, followed\nby any parameters it needs.\nSee also prepare-statement for additional options.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/query"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "quoted",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L68",
   :line 68,
   :var-type "function",
   :arglists ([q] [q x]),
   :doc
   "With a single argument, returns a naming strategy function that quotes\nnames. The single argument can either be a single character or a vector\npair of characters.\nCan also be called with two arguments - a quoting argument and a name -\nand returns the fully quoted string:\n  (quoted \\` \"foo\") will return \"`foo`\"\n  (quoted [\\[ \\]] \"foo\") will return \"[foo]\"",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/quoted"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "result-set-seq",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L382",
   :line 382,
   :var-type "function",
   :arglists
   ([rs]
    [rs
     {:keys [as-arrays? identifiers qualifier],
      :or {identifiers lower-case}}]),
   :doc
   "Creates and returns a lazy sequence of maps corresponding to the rows in the\njava.sql.ResultSet rs. Loosely based on clojure.core/resultset-seq but it\nrespects the specified naming strategy. Duplicate column names are made unique\nby appending _N before applying the naming strategy (where N is a unique integer),\nunless the :as-arrays? option is :cols-as-is, in which case the column names\nare untouched (the result set maintains column name/value order).\nThe :identifiers option specifies how SQL column names are converted to Clojure\nkeywords. The default is to convert them to lower case.\nThe :qualifier option specifies the namespace qualifier for those identifiers.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/result-set-seq"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "update!",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L1174",
   :line 1174,
   :var-type "function",
   :arglists
   ([db table set-map where-clause]
    [db table set-map where-clause opts]),
   :doc
   "Given a database connection, a table name, a map of column values to set and a\nwhere clause of columns to match, perform an update. The options may specify\nhow column names (in the set / match maps) should be transformed (default\n'as-is') and whether to run the update in a transaction (default true).\nExample:\n  (update! db :person {:zip 94540} [\"zip = ?\" 94546])\nis equivalent to:\n  (execute! db [\"UPDATE person SET zip = ? WHERE zip = ?\" 94540 94546])",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/update!"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "with-db-connection",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L666",
   :line 666,
   :var-type "macro",
   :arglists ([binding & body]),
   :doc
   "Evaluates body in the context of an active connection to the database.\n(with-db-connection [con-db db-spec]\n  ... con-db ...)",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/with-db-connection"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "with-db-metadata",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L676",
   :line 676,
   :var-type "macro",
   :arglists ([binding & body]),
   :doc
   "Evaluates body in the context of an active connection with metadata bound\nto the specified name. See also metadata-result for dealing with the results\nof operations that retrieve information from the metadata.\n(with-db-metadata [md db-spec]\n  ... md ...)",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/with-db-metadata"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "with-db-transaction",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L652",
   :line 652,
   :var-type "macro",
   :arglists ([binding & body]),
   :doc
   "Evaluates body in the context of a transaction on the specified database connection.\nThe binding provides the database connection for the transaction and the name to which\nthat is bound for evaluation of the body. The binding may also specify the isolation\nlevel for the transaction, via the :isolation option and/or set the transaction to\nreadonly via the :read-only? option.\n(with-db-transaction [t-con db-spec {:isolation level :read-only? true}]\n  ... t-con ...)\nSee db-transaction* for more details.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/with-db-transaction"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "IResultSetReadColumn",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L364",
   :line 364,
   :var-type "protocol",
   :arglists nil,
   :doc
   "Protocol for reading objects from the java.sql.ResultSet. Default\nimplementations (for Object and nil) return the argument, and the\nBoolean implementation ensures a canonicalized true/false value,\nbut it can be extended to provide custom behavior for special types.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/IResultSetReadColumn"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "ISQLParameter",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L345",
   :line 345,
   :var-type "protocol",
   :arglists nil,
   :doc
   "Protocol for setting SQL parameters in statement objects, which\ncan convert from Clojure values. The default implementation just\ndelegates the conversion to ISQLValue's sql-value conversion and\nuses .setObject on the parameter. It can be extended to use other\nmethods of PreparedStatement to convert and set parameter values.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/ISQLParameter"}
  {:raw-source-url
   "https://github.com/clojure/java.jdbc/raw/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj",
   :name "ISQLValue",
   :file "src/main/clojure/clojure/java/jdbc.clj",
   :source-url
   "https://github.com/clojure/java.jdbc/blob/f9fe3dde5b4bc5f1a5b5a79ffb5374fad3377b0b/src/main/clojure/clojure/java/jdbc.clj#L331",
   :line 331,
   :var-type "protocol",
   :arglists nil,
   :doc
   "Protocol for creating SQL values from Clojure values. Default\nimplementations (for Object and nil) just return the argument,\nbut it can be extended to provide custom behavior to support\nexotic types supported by different databases.",
   :namespace "clojure.java.jdbc",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/ISQLValue"}
  {:name "result-set-read-column",
   :doc
   "Function for transforming values after reading them from the database",
   :var-type "function",
   :namespace "clojure.java.jdbc",
   :arglists ([val rsmeta idx]),
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/result-set-read-column",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "set-parameter",
   :doc
   "Convert a Clojure value into a SQL value and store it as the ix'th\nparameter in the given SQL statement object.",
   :var-type "function",
   :namespace "clojure.java.jdbc",
   :arglists ([val stmt ix]),
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/set-parameter",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "sql-value",
   :doc "Convert a Clojure value into a SQL value.",
   :var-type "function",
   :namespace "clojure.java.jdbc",
   :arglists ([val]),
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#clojure.java.jdbc/sql-value",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:keyword :clojure.java.jdbc.spec/column-spec,
   :spec
   (cat
    :col
    :clojure.java.jdbc.spec/identifier
    :spec
    (* (or :kw keyword? :str string?))),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/column-spec"}
  {:keyword :clojure.java.jdbc.spec/connection,
   :spec (instance? java.sql.Connection %),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/connection"}
  {:keyword :clojure.java.jdbc.spec/create-options,
   :spec
   (keys
    :req-un
    []
    :opt-un
    [:clojure.java.jdbc.spec/table-spec
     :clojure.java.jdbc.spec/entities]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/create-options"}
  {:keyword :clojure.java.jdbc.spec/db-spec,
   :spec
   (or
    :connection
    :clojure.java.jdbc.spec/db-spec-connection
    :factory
    :clojure.java.jdbc.spec/db-spec-factory
    :driver-mgr
    :clojure.java.jdbc.spec/db-spec-driver-manager
    :friendly
    :clojure.java.jdbc.spec/db-spec-driver-manager-alt
    :datasource
    :clojure.java.jdbc.spec/db-spec-data-source
    :jndi
    :clojure.java.jdbc.spec/db-spec-jndi
    :raw
    :clojure.java.jdbc.spec/db-spec-raw
    :uri
    :clojure.java.jdbc.spec/db-spec-string),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec"}
  {:keyword :clojure.java.jdbc.spec/db-spec-connection,
   :spec (keys :req-un [:clojure.java.jdbc.spec/connection]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-connection"}
  {:keyword :clojure.java.jdbc.spec/db-spec-data-source,
   :spec
   (keys
    :req-un
    [:clojure.java.jdbc.spec/datasource]
    :opt-un
    [:clojure.java.jdbc.spec/username
     :clojure.java.jdbc.spec/user
     :clojure.java.jdbc.spec/password]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-data-source"}
  {:keyword :clojure.java.jdbc.spec/db-spec-driver-manager,
   :spec
   (keys
    :req-un
    [:clojure.java.jdbc.spec/subprotocol
     :clojure.java.jdbc.spec/subname]
    :opt-un
    [:clojure.java.jdbc.spec/classname]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-driver-manager"}
  {:keyword :clojure.java.jdbc.spec/db-spec-driver-manager-alt,
   :spec
   (keys
    :req-un
    [:clojure.java.jdbc.spec/dbtype :clojure.java.jdbc.spec/dbname]
    :opt-un
    [:clojure.java.jdbc.spec/host :clojure.java.jdbc.spec/port]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-driver-manager-alt"}
  {:keyword :clojure.java.jdbc.spec/db-spec-factory,
   :spec (keys :req-un [:clojure.java.jdbc.spec/factory]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-factory"}
  {:keyword :clojure.java.jdbc.spec/db-spec-jndi,
   :spec
   (keys
    :req-un
    [:clojure.java.jdbc.spec/name]
    :opt-un
    [:clojure.java.jdbc.spec/environment]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-jndi"}
  {:keyword :clojure.java.jdbc.spec/db-spec-raw,
   :spec (keys :req-un [:clojure.java.jdbc.spec/connection-uri]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-raw"}
  {:keyword :clojure.java.jdbc.spec/db-spec-string,
   :spec string?,
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/db-spec-string"}
  {:keyword :clojure.java.jdbc.spec/entity,
   :spec string?,
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/entity"}
  {:keyword :clojure.java.jdbc.spec/exec-sql-options,
   :spec
   (keys
    :req-un
    []
    :opt-un
    [:clojure.java.jdbc.spec/entities
     :clojure.java.jdbc.spec/transaction?]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/exec-sql-options"}
  {:keyword :clojure.java.jdbc.spec/execute-options,
   :spec
   (keys
    :req-un
    []
    :opt-un
    [:clojure.java.jdbc.spec/transaction?
     :clojure.java.jdbc.spec/multi?]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/execute-options"}
  {:keyword :clojure.java.jdbc.spec/execute-result,
   :spec (* integer?),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/execute-result"}
  {:keyword :clojure.java.jdbc.spec/find-by-keys-options,
   :spec
   (keys
    :req-un
    []
    :opt-un
    [:clojure.java.jdbc.spec/entities
     :clojure.java.jdbc.spec/order-by
     :clojure.java.jdbc.spec/result-set-fn
     :clojure.java.jdbc.spec/row-fn
     :clojure.java.jdbc.spec/identifiers
     :clojure.java.jdbc.spec/as-arrays?]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/find-by-keys-options"}
  {:keyword :clojure.java.jdbc.spec/identifier,
   :spec (or :kw keyword? :str string?),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/identifier"}
  {:keyword :clojure.java.jdbc.spec/prepare-options,
   :spec
   (keys
    :req-un
    []
    :opt-un
    [:clojure.java.jdbc.spec/return-keys
     :clojure.java.jdbc.spec/result-type
     :clojure.java.jdbc.spec/concurrency
     :clojure.java.jdbc.spec/cursors
     :clojure.java.jdbc.spec/fetch-size
     :clojure.java.jdbc.spec/max-rows
     :clojure.java.jdbc.spec/timeout]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/prepare-options"}
  {:keyword :clojure.java.jdbc.spec/prepared-statement,
   :spec (instance? java.sql.PreparedStatement %),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/prepared-statement"}
  {:keyword :clojure.java.jdbc.spec/query-options,
   :spec
   (keys
    :req-un
    []
    :opt-un
    [:clojure.java.jdbc.spec/result-set-fn
     :clojure.java.jdbc.spec/row-fn
     :clojure.java.jdbc.spec/identifiers
     :clojure.java.jdbc.spec/as-arrays?]),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/query-options"}
  {:keyword :clojure.java.jdbc.spec/sql-params,
   :spec
   (or
    :sql
    :clojure.java.jdbc.spec/sql-stmt
    :sql-params
    (cat
     :sql
     :clojure.java.jdbc.spec/sql-stmt
     :params
     (* :clojure.java.jdbc.spec/sql-value))),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/sql-params"}
  {:keyword :clojure.java.jdbc.spec/sql-stmt,
   :spec
   (or :sql string? :stmt :clojure.java.jdbc.spec/prepared-statement),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/sql-stmt"}
  {:keyword :clojure.java.jdbc.spec/sql-value,
   :spec (constantly true),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/sql-value"}
  {:keyword :clojure.java.jdbc.spec/where-clause,
   :spec
   (cat :where string? :params (* :clojure.java.jdbc.spec/sql-value)),
   :var-type "spec",
   :namespace "clojure.java.jdbc.spec",
   :wiki-url
   "http://clojure.github.io/java.jdbc//index.html#:clojure.java.jdbc.spec/where-clause"})}